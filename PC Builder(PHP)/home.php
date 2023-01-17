<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>

    <link rel="stylesheet" href="style.css">
    <!-- Font Source -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,600;1,500&family=Roboto+Serif:wght@500&family=Roboto:ital,wght@1,300&display=swap" rel="stylesheet">
    <!-- End Font Source -->
    <!-- <link rel="stylesheet"href="https://unpkg.com/swiper/swiper-bundle.min.css"/> -->
    
    <!-- Swiper Source -->
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />
    <!-- End of Swiper Source -->

</head>
<body>

    <!-- Headers -->
    
    <section class="header">
    
        <h1><a href="home.php" class="brand">PC Builder</a></h1>
        
        <nav class="navbar">
            <a href="home.php">Home</a>
            <a href="about.php">About</a>
            <a href="package.php">Package</a>
            <a href="book.php">Build</a>
        </nav>

        <div id="menu-btn" class="fa fa-bars"></div>
    </section>

<!-- End of Headers -->

<!-- Home -->

<section class="home">
    <div class="swiper home-sliders">
        <div class="swiper-wrapper">
            <div class="swiper-slide slide" style="background: url(slide4.jpg) no-repeat;">
                <div class="content">
                    <span> Explore , Discover , Build </span>
                    <h3> Build Your Dream Pc </h3>
                    <a href="package.php" class="btn">More</a>
                </div>
            </div>

            <div class="swiper-slide slide" style="background: url(slide10.jpg)no-repeat;">
                <div class="content">
                    <span> Explore , Discover , Build </span>
                    <h3> Custom Build Your Own Pc </h3>
                    <a href="package.php" class="btn">More</a>
                </div>
            </div>

            <div class="swiper-slide slide" style="background: url(slide3.jpg)no-repeat;">
                <div class="content">
                    <span> Explore , Discover , Build </span>
                    <h3> Build With Your Budget </h3>
                    <a href="package.php" class="btn">More</a>
                </div>
            </div>
        </div>

        <div class="swiper-button-next"></div>
      <div class="swiper-button-prev"></div>

    </div>
</section>

<!-- End of Home -->

<!-- Start of Services -->

<section class="services">
    <h1 class="heading-title">Services</h1> 
    <div class="box-container">
        <div class="box">
            <img src="image1.jpg" alt="">
            <h3>Package</h3>
        </div>

        <div class="box">
            <img src="slide9.jpg" alt="">
            <h3>Customize Build</h3>
        </div>

        <div class="box">
            <img src="image6.jpg" alt="">
            <h3>Pc Components</h3>
        </div>
    </div>
    
</section>

<!-- End of Services -->

<!-- Home-About -->

<section class="home-about">
    <div class="image">
        <img src="image9.jpg" alt="">
    </div>

    <div class="content">
        <h3>About</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus tincidunt, nunc porttitor rhoncus interdum, eros lorem faucibus quam, ac porta lacus sapien eget nibh. Phasellus magna nisi, accumsan sed diam a, tempus mollis nisi. Nam varius, orci nec imperdiet eleifend, tellus nulla laoreet libero, nec tempor augue diam vitae lacus. Sed pharetra velit ante, nec commodo ante pulvinar quis. Cras pharetra lorem sed urna interdum vulputate. Nam semper euismod urna, eu rutrum nibh malesuada aliquam. Cras eget nisi eget lorem pulvinar mattis.</p>
        <a href="about.php" class="btn">Read More</a>
    </div>
</section>

<!-- End of Home-About -->

<!-- Home-Package -->

<section class="home-package">
    <h1 class="heading-title">Packages</h1>
    <div class="box-container">
        <div class="box">
            <div class="image">
                <img src="image11.jpg" alt="">
            </div>
        <div class="content">
            <h3>Choose and build</h3>
            <p>Build a Gaming PC depends on your games</p>
            <a href="book.php" class="btn">Build Now</a>
        </div>
        </div>

        <div class="box">
            <div class="image">
                <img src="image12.jpg" alt="">
            </div>
        <div class="content">
            <h3>Budget build</h3>
            <p>Build a gaming PC follow your budget</p>
            <a href="book.php" class="btn">Build Now</a>
        </div>
        </div>

        <div class="box">
            <div class="image">
                <img src="image13.jpg" alt="">
            </div>
        <div class="content">
            <h3>High End Build </h3>
            <p>Build a high end gaming PC and boost your gaming experience</p>
            <a href="book.php" class="btn">Build Now</a>
        </div>
        </div>

    </div>

    <div class="load-more"><a href="package.php" class="btn">Load More</a></div>
</section>

<!-- End of Home-package -->

<!-- Promotion -->

<section class="home-promotion">
    <div class="content">
        <h3>Special Promo</h3> 
        <p>Free shipping , when you spend more than 100$ in Store.</p>
        <a href="book.php"><div class="btn">Build Now</div></a>
    </div>
</section>

<!-- End of Promotion -->

<!-- Footer -->
<section class="footer">
    <div class="box-container">
        <div class="box">
            <h3>Quick Links</h3>
            <a href="home.php"><i class="fas fa-angle-right"></i> Home</a>
            <a href="book.php"><i class="fas fa-angle-right"></i> Build</a>
            <a href="package.php"><i class="fas fa-angle-right"></i> Package</a>
            <a href="about.php"><i class="fas fa-angle-right"></i> About</a>
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
        </div>

    </div>
    <div class="credit">Created by <span>XLY. dev </span>| All Rights Reserved |</div>
</section>
<!-- End of Footer -->





    <script src="script.js"></script>
</body>
</html>