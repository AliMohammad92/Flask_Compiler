from flask import Flask, render_template_string, request, redirect, url_for

app = Flask(__name__)

products = []

ADD_PRODUCT_HTML = """
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Flask Store | Add Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
    <style>
        body { background: #f4f7f6; font-family: Segoe UI, Tahoma, Geneva, Verdana, sans-serif; }
        .card { border: none; border-radius: 15px; box-shadow: 0 10px 30px rgba(0,0,0,0.1); }
        .btn-primary { background: #4e73df; border: none; padding: 10px 20px; border-radius: 10px; transition: 0.3s; }
        .btn-primary:hover { background: #2e59d9; transform: translateY(-2px); }
        .form-label { font-weight: 600; color: #333; }
        .header-section { background: #4e73df; color: white; padding: 40px 0; border-radius: 0 0 50px 50px; margin-bottom: -50px; }
    </style>
</head>
<body>

<div class="header-section text-center">
    <h1>🚀 Flask Product Manager</h1>
    <p>Add high-quality products to your store instantly</p>
</div>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card p-4">
                <h3 class="text-center mb-4">Add New Item</h3>
                <form method="POST">
                    <div class="mb-3">
                        <label class="form-label">Product Name</label>
                        <input type="text" name="name" class="form-control" placeholder="e.g. iPhone 15 Pro" required />
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Price ($)</label>
                        <input type="number" step="0.01" name="price" class="form-control" placeholder="999.99" required />
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Image URL</label>
                        <input type="text" name="image" class="form-control" placeholder="https://link-to-image.jpg" required />
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Product Details</label>
                        <textarea name="details" class="form-control" rows="3" placeholder="Describe the product..."></textarea>
                    </div>
                    <div class="d-grid">
                        <button type="submit" class="btn btn-primary">✨ Save Product</button>
                    </div>
                </form>
                <div class="text-center mt-3">
                    <a href="/" class="text-muted text-decoration-none">← Back to Dashboard</a>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
"""

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
        return redirect(url_for("add_product"))
    }

    return render_template_string(ADD_PRODUCT_HTML)
}
if __name__ == "__main__"{
    app.run(debug=True)
}
