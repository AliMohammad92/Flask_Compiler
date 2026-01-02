from flask import Flask, redirect, url_for

app = Flask(__name__)

products = [
    {"id": 1, "name": "Laptop", "price": 1200, "image": "laptop.jpg", "details": "Powerful laptop"},
    {"id": 2, "name": "Phone", "price": 800, "image": "phone.jpg", "details": "Smartphone with good camera"}
]

@app.route("/delete/<int:id>")
def delete_product(id) {
    global products
    products = [p for p in products if p["id"] != id]
    return redirect(url_for("show_products"))
}

@app.route("/admin")
def admin_panel() {
    return """
    <html>
    <head>
    <style>
        .admin-container {
            padding: 40px;
            font-family: "Segoe UI";
            background-color: "#f9f9f9";
        }
        .header {
            text-align: "center";
            margin-bottom: 30px;
        }
        .product-list {
            display: "flex";
            flex-direction: "column";
            gap: 15px;
            max-width: 800px;
            margin: "0 auto";
        }
        .product-item {
            display: "flex";
            align-items: "center";
            justify-content: "space-between";
            background: "white";
            padding: 20px;
            border-radius: 12px;
            box-shadow: "0 2px 10px rgba(0,0,0,0.05)";
        }
        .product-info {
            display: "flex";
            align-items: "center";
            gap: 20px;
        }
        .product-info img {
            width: 60px;
            height: 60px;
            border-radius: 8px;
            object-fit: "cover";
        }
        .product-name {
            font-weight: "bold";
            font-size: 18px;
            color: "#333";
        }
        .delete-btn {
            background-color: "#e74c3c";
            color: "white";
            padding: 10px 20px;
            border-radius: 6px;
            text-decoration: "none";
            font-weight: "500";
            transition: "background 0.3s";
        }
        .empty-msg {
            text-align: "center";
            color: "#888";
            font-style: "italic";
        }
    </style>
    </head>
    <body>
    <div class="admin-container">
            <div class="header">
                <h1>"Product Management Dashboard"</h1>
            </div>

            <div class="product-list">
                {% for p in products %}
                    <div class="product-item">
                        <div class="product-info">
                            <img src="{{ p.image }}" />
                            <div>
                                <span class="product-name">{{ p.name }}</span>
                                <p>"ID: " {{ p.id }}</p>
                            </div>
                        </div>

                        <a class="delete-btn" href="/delete/{{ p.id }}">
                            "Delete Product"
                        </a>
                    </div>
                {% endfor %}

                {% set total_count = [item.id for item in products] %}
                {% if not total_count %}
                    <p class="empty-msg">"No products available in the inventory."</p>
                {% endif %}
            </div>
        </div>
     </body>
     </html>
    """
}

if __name__ == "__main__" {
    app.run(debug=True)
}