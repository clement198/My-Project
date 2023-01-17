<?php
    $dbconnection = mysqli_connect('localhost' , 'root' , '' , 'order_db');

    if(isset($_POST['send'])){
        $fname = $_POST['fname'];
        $lname = $_POST['lname'];
        $email = $_POST['email'];
        $phone = $_POST['pnumber'];
        $address1 = $_POST['address1'];
        $address2 = $_POST['address2'];
        $city = $_POST['city'];
        $state = $_POST['state'];
        $postal = $_POST['postal'];
        $country = $_POST['country'];

        $sql1 = "INSERT INTO order_form(fname,lname,email,phone,address1,address2,city,state,postal,country) 
        VALUES ('$fname' , '$lname' , '$email' , '$phone' , '$address1' , '$address2' , '$city' , '$state' , '$postal' , '$country' )";

        mysqli_query($dbconnection , $sql1);
        header('location:book.php');

    }
    else {
        echo 'something went wrong try again' ;
    }

?>