from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

products = []

@app.route("/add", methods=["GET", "POST"])
def add_product() {
    if request.method == "POST" {
        new_product = {
            "id": len(products) + 1,
            "name": request.form["name"],
            "price": float(request.form["price"]),
            "image": request.form["image"],
            "details": request.form["details"]
        }
        products.append(new_product)
        return redirect(url_for("show_products"))
    }
    return """
    <html>
    <head>
        <title>Add Product</title>
    </head>
    <body>
    <h1>Add New Product</h1>
    <form method="POST">
        Name: <input type="text" name="name" /><br />
        Price: <input type="text" name="price" /><br />
        Image: <input type="text" name="image" /><br />
        Details: <input type="text" name="details" /><br />
        <button type="submit">Add Product</button>
    </form>
    </body>
    </html>

    """
}
if __name__ == "__main__" {
    app.run(debug=True)
}
