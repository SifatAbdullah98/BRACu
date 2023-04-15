<?php
require_once('DBconnect.php');
	$ui = $_POST['User_id'];
	$sql = " Update customer_reviews set Approval_status='1' where User_id= $ui ";
	
	//Execute the query 
	$result = mysqli_query($conn, $sql);
    if(mysqli_affected_rows($conn)){
	
		echo "APPROVED!";
		header("Location: ApproveReview.php");
	}
	else{
		echo "Something Went Wrong.";
		header("Location: ApproveReview.php");
	}
?>