from flask import Flask, render_template, abort

app = Flask(__name__)

products = [
    {"id": 1, "name": "Laptop", "price": 1200, "image": "laptop.jpg", "details": "Powerful laptop"},
    {"id": 2, "name": "Phone", "price": 800, "image": "phone.jpg", "details": "Smartphone with good camera"}
]

@app.route("/products/<int:id>")
def product_details(id) {
    product = next((p for p in products if p["id"] == id), None)

    if product is None {
        abort(404)
    }
    return """
    <html>
    <head>
        <title>{{ product.name }}</title>
        <style>
            /* اختبار الـ Group Selector والـ Element Selector */
            body, html {
                background-color: #f4f4f4;
                margin: 0;
                padding: 20px;
            }

            /* اختبار الـ ID Selector */
            #product-card {
                background-color: white;
                padding: 20px;
                border-radius: 8px;
            }

            /* اختبار الـ Class Selector */
            .price-tag {
                color: #e91e63;
                font-weight: bold;
                font-size: 20px;
            }

            h1 {
                color: #333;
                border-bottom: 2px solid #eeeeee;
            }

            img {
                border: 1px solid #cccccc;
            }
        </style>
    </head>
    <body>
        <div id="product-card">
            <h1>{{ product.name }}</h1>

            <img src="{{ product.image }}" width="300" />

            <p class="price-tag">Price: ${{ product.price }}</p>

            <p>Details: {{ product.details }}</p>

            <hr />
            <a href="/products">Back to products list</a>
        </div>
    </body>
    </html>
    """
}

if __name__ == "__main__" {
    app.run(debug=True)
}