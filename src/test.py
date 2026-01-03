from flask import Flask, render_template, redirect, url_for, request

app = Flask(__name__)

products = [
    {"id": 1, "name": "MacBook Pro", "price": 2499, "image": "https://images.unsplash.com/photo-1517336714460-4c9889a79453?w=400", "details": "Apple M2 Max Chip, 32GB RAM, 1TB SSD. The ultimate powerhouse for creators."},
    {"id": 2, "name": "iPhone 15 Pro", "price": 999, "image": "https://images.unsplash.com/photo-1510557880182-3d4d3cba35a5?w=400", "details": "Aerospace-grade titanium design, A17 Pro chip, and advanced camera system."},
    {"id": 3, "name": "Sony WH-1000XM5", "price": 349, "image": "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=400", "details": "Industry-leading noise canceling with two processors and 8 microphones."},
    {"id": 4, "name": "Apple Watch Ultra", "price": 799, "image": "https://images.unsplash.com/photo-1434494878577-86c23bcb06b9?w=400", "details": "The most rugged and capable Apple Watch ever. Built for the great outdoors."},
    {"id": 5, "name": "Gaming Desktop", "price": 3200, "image": "https://images.unsplash.com/photo-1587202372775-e229f172b9d7?w=400", "details": "RTX 4090, Intel i9-14900K, Liquid Cooled. Built for elite gaming performance."},
    {"id": 6, "name": "Mechanical Keyboard", "price": 150, "image": "https://images.unsplash.com/photo-1511467687858-23d96c32e4ae?w=400", "details": "RGB Backlit, Cherry MX Blue switches, and premium aluminum top plate."},
    {"id": 7, "name": "iPad Pro M2", "price": 1099, "image": "https://images.unsplash.com/photo-1544244015-0df4b3ffc6b0?w=400", "details": "Astonishing performance, incredibly advanced displays, and superfast wireless."},
    {"id": 8, "name": "GoPro HERO12", "price": 399, "image": "https://images.unsplash.com/photo-1502982722669-bfd3976c83f7?w=400", "details": "Incredible image quality, even better HyperSmooth video stabilization."},
    {"id": 9, "name": "Nintendo Switch", "price": 299, "image": "https://images.unsplash.com/photo-1578303372216-f12f3c04604a?w=400", "details": "Play at home or on the go with a vibrant OLED screen and versatile controllers."},
    {"id": 10, "name": "DJI Mini 4 Pro", "price": 759, "image": "https://images.unsplash.com/photo-1473960566675-24a3a983bb7f?w=400", "details": "Mini to the Max. Foldable mini-drone with 4K HDR video and 34-min flight time."}
]

@app.route("/")
def index() {
    return """
        <html>

        <head>
            <style>
                body {
                    font-family: sans-serif;
                    background: #f4f7f6;
                    margin: 0;
                    text-align: center;
                }

                .navbar {
                    background: #2c3e50;
                    padding: 20px;
                }

                .navbar a {
                    color: white;
                    text-decoration: none;
                    margin: 0 15px;
                    font-weight: bold;
                }

                .hero {
                    padding: 100px 20px;
                }

                h1 {
                    color: #2c3e50;
                    font-size: 3em;
                }
            </style>
        </head>

        <body>
        <div class="navbar">
            <a href="/">Home</a>
            <a href="/products">Show Products</a>
            <a href="/add">Add Product</a>
        </div>
        <div class="hero">
            <h1>Welcome to TechStore</h1>
            <p>Manage your professional inventory with ease.</p>
        </div>
        </body>
        </html>
    """
}

@app.route("/products")
def show_products() {
    return """
        <html>

        <head>
            <style>
                body {
                    font-family: sans-serif;
                    background: #f4f7f6;
                    margin: 0;
                }

                .navbar {
                    background: #2c3e50;
                    padding: 20px;
                    text-align: center;
                }

                .navbar a {
                    color: white;
                    text-decoration: none;
                    margin: 0 15px;
                    font-weight: bold;
                }

                .grid {
                    display: flex;
                    flex-wrap: wrap;
                    justify-content: center;
                    gap: 25px;
                    padding: 40px;
                }

                .card {
                    background: white;
                    width: 260px;
                    padding: 20px;
                    border-radius: 15px;
                    box-shadow: 0 10px 20px rgba(0, 0, 0, 0.05);
                    text-align: center;
                }

                .card img {
                    width: 100%;
                    border-radius: 10px;
                    height: 180px;
                    object-fit: cover;
                }

                .price {
                    color: #27ae60;
                    font-size: 22px;
                    font-weight: bold;
                    margin: 15px 0;
                }

                .btn-del {
                    background: #e74c3c;
                    color: white;
                    padding: 10px 20px;
                    text-decoration: none;
                    border-radius: 8px;
                    display: inline-block;
                }
            </style>
        </head>

        <body>
        <div class="navbar">
            <a href="/">Home</a>
            <a href="/products">Show Products</a>
            <a href="/add">Add Product</a>
        </div>
        <div class="grid">
            {% for p in products %}
            <div class="card">
                <a href="/product/{{ p.id }}" style="text-decoration: none; color: inherit;">
                    <img src="{{ p.image }}" />
                    <h3>{{ p.name }}</h3>
                </a>
                <p class="price">${{ p.price }}</p>
                <a href="/delete/{{ p.id }}" class="btn-del">Delete Item</a>
            </div>
            {% endfor %}
        </div>
        </body>

        </html>
    """
}

@app.route("/add", methods=["GET", "POST"])
def add_product() {
    if request.method == "POST" {
        new_item = {
            "id": len(products) + 1,
            "name": request.form.get("name"),
            "price": int(request.form.get("price")),
            "image": "https://via.placeholder.com/200",
            "details": request.form.get("details")
        }
        products.append(new_item)
        return """
        <html>

        <head>
            <style>
                body {
                    font-family: sans-serif;
                    background: #f4f7f6;
                    margin: 0;
                }

                .navbar {
                    background: #2c3e50;
                    padding: 20px;
                    text-align: center;
                }

                .navbar a {
                    color: white;
                    text-decoration: none;
                    margin: 0 15px;
                    font-weight: bold;
                }

                .container {
                    display: flex;
                    justify-content: center;
                    padding-top: 60px;
                }

                .form-box {
                    background: white;
                    padding: 40px;
                    border-radius: 15px;
                    box-shadow: 0 10px 20px rgba(0, 0, 0, 0.05);
                    width: 350px;
                }

                input {
                    width: 100%;
                    padding: 12px;
                    margin: 10px 0;
                    border: 1px solid #ddd;
                    border-radius: 8px;
                    box-sizing: border-box;
                }

                .btn-add {
                    background: #2ecc71;
                    color: white;
                    width: 100%;
                    padding: 12px;
                    border: none;
                    border-radius: 8px;
                    cursor: pointer;
                    font-size: 16px;
                }
            </style>
        </head>

        <body>
            <div class="navbar">
                <a href="/">Home</a>
                <a href="/products">Show Products</a>
                <a href="/add">Add Product</a>
            </div>
            <div class="container">
                <div class="form-box">
                    <h2>Add New Product</h2>
                    <form method="POST">
                        <input type="text" name="name" placeholder="Product Name" required />
                        <input type="number" name="price" placeholder="Price" required />
                        <input type="text" name="details" placeholder="Details" required />
                        <button type="submit" class="btn-add">Save Product</button>
                    </form>
                </div>
            </div>
        </body>

        </html>
        """
    }
    return render_template("add.html")
}

@app.route("/delete/<int:id>")
def delete_product(id) {
    global products
    products = [p for p in products if p["id"] != id]
    return redirect(url_for("show_products"))
}


@app.route("/product/<int:id>")
def product_details(id) {
    product = next((p for p in products if p["id"] == id), None)
    if product {
        return """
            <html>

            <head>
                <style>
                    body {
                        font-family: sans-serif;
                        background: #f4f7f6;
                        margin: 0;
                    }

                    .navbar {
                        background: #2c3e50;
                        padding: 20px;
                        text-align: center;
                    }

                    .navbar a {
                        color: white;
                        text-decoration: none;
                        margin: 0 15px;
                        font-weight: bold;
                    }

                    .grid {
                        display: flex;
                        flex-wrap: wrap;
                        justify-content: center;
                        gap: 25px;
                        padding: 40px;
                    }

                    .card {
                        background: white;
                        width: 260px;
                        padding: 20px;
                        border-radius: 15px;
                        box-shadow: 0 10px 20px rgba(0, 0, 0, 0.05);
                        text-align: center;
                    }

                    .card img {
                        width: 100%;
                        border-radius: 10px;
                        height: 180px;
                        object-fit: cover;
                    }

                    .price {
                        color: #27ae60;
                        font-size: 22px;
                        font-weight: bold;
                        margin: 15px 0;
                    }

                    .btn-del {
                        background: #e74c3c;
                        color: white;
                        padding: 10px 20px;
                        text-decoration: none;
                        border-radius: 8px;
                        display: inline-block;
                    }
                </style>
            </head>

            <body>
            <div class="navbar">
                <a href="/">Home</a>
                <a href="/products">Show Products</a>
                <a href="/add">Add Product</a>
            </div>
            <div class="grid">
                {% for p in products %}
                <div class="card">
                    <a href="/product/{{ p.id }}" style="text-decoration: none; color: inherit;">
                        <img src="{{ p.image }}" />
                        <h3>{{ p.name }}</h3>
                    </a>
                    <p class="price">${{ p.price }}</p>
                    <a href="/delete/{{ p.id }}" class="btn-del">Delete Item</a>
                </div>
                {% endfor %}
            </div>
            </body>
            </html>
        """
    }
    return "Product not found", 404
}

if __name__ == "__main__" {
    app.run(debug=True)
}