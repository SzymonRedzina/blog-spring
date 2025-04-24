 async function fetchPosts() {
        const res = await fetch("http://localhost:8080/api/posts");
        const posts = await res.json();
        const container = document.getElementById("posts");
        container.innerHTML = "";
        posts.forEach(post => {
            const div = document.createElement("div");
            div.className = "post";
            div.innerHTML = `<h3>${post.title}</h3><p>${post.content}</p><button class="btn" onclick="deletePost(${post.id})">🗑</button>`;
            container.appendChild(div);
        });
    }
    async function deletePost(id) {
        await fetch(`http://localhost:8080/api/posts/${id}`, {
         method: "DELETE"
        });
        fetchPosts();
    }
   


    async function createPost() {
        const title = document.getElementById("title").value;
        const content = document.getElementById("content").value;

        await fetch("http://localhost:8080/api/posts", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ title, content })
        });

        document.getElementById("title").value = "";
        document.getElementById("content").value = "";
        fetchPosts();
    }

    fetchPosts();