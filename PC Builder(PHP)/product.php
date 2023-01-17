<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin</title>
    
    <link rel="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,600;1,500&family=Roboto+Serif:wght@500&family=Roboto:ital,wght@1,300&display=swap" rel="stylesheet">
</head>
<body>
    <!-- Headers -->
    <section class="header">
    
        <h1><a href="product.php" class="product-name">PC Builder</a></h1>
        
        <nav class="navbar">
            <!-- <a href="home.php">Home</a>
            <a href="about.php">About</a>
            <a href="package.php">Package</a>
            <a href="book.php">Build</a> -->
        </nav>

        <div id="menu-btn" class="fa fa-bars"></div>
    </section>
<!-- End of Headers -->

<!-- Start of About-->
<!-- <div class="heading" style="background: url('img3.jpg') no-repeat;">
    <h1>Product</h1>
</div> -->
<!-- End of About-->

<!-- Start of Book -->

<section class="booking">
    
    <h1 class="pheading-title">stock update</h1>
    
    <form action="#" method="POST" class="book-form">
        
        <div class="flex">
            <div class="inputBox">
                <span>Intel Processor:</span>
                <input type="text" placeholder="First Name" name="fname">
            </div>

            <div class="inputBox">
                <span>AMD Processor:</span>
                <input type="text" placeholder="Last Name" name="lname">
            </div>

            <div class="inputBox">
                <span>Cooler:</span>
                <input type="email" placeholder="example@gmail.com" name="email">
            </div>

            <div class="inputBox">
                <span>Motherboard Intel:</span>
                <input type="number" placeholder="0123456789" name="pnumber">
            </div>

            <div class="inputBox">
                <span>Motherboard AMD:</span>
                <input type="text" placeholder="Address 1" name="address1">
            </div>

            <div class="inputBox">
                <span>RAM:</span>
                <input type="text" placeholder="Address 2" name="address2"> 
            </div>

            <div class="inputBox">
                <span>Graphic Card:</span>
                <input type="text" placeholder="City" name="city">
            </div>

            <div class="inputBox">
                <span>Power Supply:</span>
                <input type="text" placeholder="State" name="state">
            </div>

            <div class="inputBox">
                <span>Case:</span>
                <input type="number" placeholder="Postal" name="postal">
            </div>

            <div class="inputBox">
                <span>Country:</span>
                <input type="number" placeholder="Select Country" name="country">
            </div>

        </div>

        <input type="submit" value="submit" class="btn" name="send">

    </form>

</section>

<!-- End Start of Book -->

<!-- Footer -->
<section class="footer">
    <div class="box-container">
        <!-- <div class="box">
            <h3>Quick Links</h3>
            <a href="home.php"><i class="fas fa-angle-right"></i> Home</a>
            <a href="about.php"><i class="fas fa-angle-right"></i> About</a>
            <a href="package.php"><i class="fas fa-angle-right"></i> Package</a>
            <a href="book.php"><i class="fas fa-angle-right"></i> Build</a>
        </div>

        <div class="box">
            <h3>More Links</h3>
            <a href="#"><i class="fas fa-angle-right"></i> Ask Question</a>
            <a href="#"><i class="fas fa-angle-right"></i> About</a>
            <a href="#"><i class="fas fa-angle-right"></i> Privacy Policy</a>
            <a href="#"><i class="fas fa-angle-right"></i> Terms of use</a>
        </div>

        <div class="box">
            <h3>Contact</h3>
            <a href="#"><i class="fas fa-phone"></i> +6012-123-4567 </a>
            <a href="#"><i class="fas fa-phone"></i> +6011-321-7654 </a>
            <a href="#"><i class="fas fa-envelope"></i> pcbuilder@hotmail.com </a>
            <a href="#"><i class="fas fa-map"></i> Pulau Pinang, Malaysia, 14000 </a>
        </div>

        <div class="box">
            <h3>Follow Us</h3>
            <a href="#"><i class="fab fa-facebook-f"></i> Facebook</a>
            <a href="#"><i class="fab fa-instagram"></i>  Instagram</a>
            <a href="#"><i class="fab fa-whatsapp"></i> Whatsapp</a>
            <a href="#"><i class="fab fa-discord"></i> Discord </a>
        </div> -->

    </div>
    <div class="credit">Created by <span>XLY. dev </span>| All Rights Reserved |</div>
</section>
<!-- End of Footer -->





    <script src="script.js"></script>
</body>
</html>