<?php
// first of all, we need to connect to the database
require_once('DBconnect.php');

// we need to check if the input in the form textfields are not empty
if(isset($_POST['id']) && isset($_POST['Email']) && isset($_POST['Review'])){
	// write the query to check if this username and password exists in our database
	$i = $_POST['id'];
	$e = $_POST['Email'];
	$r = $_POST['Review'];
	
	$sql = " INSERT INTO customer_reviews (user_id, user_email, review, Approval_status) VALUES( '$i', '$e', '$r', 0 ) ";
	
	//Execute the query 
	$result = mysqli_query($conn, $sql);
	
	//check if this insertion is happening in the database
	if(mysqli_affected_rows($conn)){
	
		echo "Approved";
		header("Location: CustomerReview.php");
	}
	else{
		echo "Something Went Wrong!!!";
		header("Location: CustomerReview.php");
	}
	
}


?>