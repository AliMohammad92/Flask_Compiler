from flask import Flask, render_template

app = Flask(__name__)

products = [
    {"id": 1, "name": "Laptop", "price": 1200, "image": "laptop.jpg", "details": "Powerful laptop"},
    {"id": 2, "name": "Phone", "price": 800, "image": "phone.jpg", "details": "Smartphone"}
]

@app.route("/products")
def show_products() {
    return """
    <html>
    <head>
    <style>
            .container {
                display: "flex";
                flex-wrap: "wrap";
                justify-content: "center";
            }
            .card {
                border: "1px solid #eee";
                padding: 20px;
                margin: 10px;
                width: 200px;
                border-radius: 10px;
                box-shadow: "0 2px 5px #ccc";
                text-align: "center";
            }
            .price {
                color: "green";
                font-weight: "bold";
                font-size: 18px;
            }
            .badge {
                color: "gold";
                font-weight: "bold";
                display: "block";
                margin-bottom: 5px;
            }
            .btn {
                background: "#3498db";
                color: "white";
                padding: 8px;
                text-decoration: "none";
                border-radius: 5px;
                display: "inline-block";
            }
        </style>
    </head>
    <body>
    <div class="container">
        {% for p in products %}
            <div class="card">
                <img src="{{ p.image }}" />
                <h3>{{ p.name }}</h3>

                {% set high_tier_ids = [item.id for item in products if item.price > 1000] %}

                {% if p.id in high_tier_ids %}
                    <span class="badge">"Premium Selection"</span>
                {% endif %}

                <p class="price">{{ p.price }}$</p>

                <a class="btn" href="/product/{{ p.id }}">"View Details"</a>
            </div>
        {% endfor %}
    </div>
    </body>
    </html>
    """
}

if (__name__ == "__main__") {
    app.run(debug=True)
}