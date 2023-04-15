<html>
<head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Dancing Script">
        <title>
            Car Rental Website by Sarder Tanivr Ahmed
        </title>
        <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"/> -->
        <style>
            .brand {
                background: #111111 !important;
            }
            .brand-text {
                color: #9a9ddb !important;
            }
            form {
                background-color: teal-lighten-3;
                max-width: 460px;
                margin: 20px auto;
                padding: 20px;
            }
       </style>
	  
	  <script src="js/jquery.js"></script>
      <script src="js/bootstrap.min.js"></script>
	  <script src="js/bootstrap.js"></script>
	  <script src="js/bootstrap.bundle.js"></script>
      <script src="js/main.js"></script>

	   
    </head>
    <body class="teal lighten-3">
	  <section id="Menu Bar">
        <nav class="white z-depth-0">
            <div class="container">
               <a href="index.php" class="brand-logo brand-text" style="font-family: Dancing-Script !important;">Car Rental Webiste</a>
                <ul id="nav-mobile" class="class right hide-on-small-and-down">               
                    <li><a href="index.php" class="btn brand z-depth-0">HOME</a></li>
                    <li><a href="CustomerDash.php" class="btn brand z-depth-0">Account Setting</a></li> 
                    <li><a href="ApproveReview.php" class="btn brand z-depth-0">View as Admin</a></li>
                    li><a href="CustomerReview.php" class="btn brand z-depth-0">Review</a></li> 
                </ul>
            </div>
        </nav>
       </section>

       <section id="Admin verification">
	  
	  <form action="ApproveReview.php" class="form_design" method="post">
         Admin_id: <input type="text" name="Admin_id"> <br/> <br/>
         Admin_password: <input type="password" name="Admin_password"> <br/> <br/>
         <input type="submit" value="Submit"/>		 
		 
	  </form>
	        </section>
 <section id="Show Review">
 
   <div class="center title"> All Review </div>
   
    <div style="margin-left:10%; ,margin-right:10%; margin-top:50px; margin-bottom:50px;text-align:centre;background:#66c3ff;"> 
       <div class="row" style="padding:5px;">
          <div class="col s1 md3">   User id </div> 
          <div class="col s2 md3">   Email </div>
           <div class="col s4 md3">   Review</div>  
           <div class="col s1 md3">   Approve Status</div>  	   
        </div>
    
	
	
   </div>   



<?php



//connecting database 

require_once("DBconnect.php");



  
if(isset($_POST['Admin_id']) && isset($_POST['Admin_password'])){
    $ai = $_POST['Admin_id'];
	$ap = $_POST['Admin_password'];
	$sql1 = "SELECT * FROM admin WHERE Admin_id = '$ai' AND Admin_Password = '$ap'";
    $result1 = mysqli_query($conn, $sql1);
	
	//check if it returns an empty set
	if(mysqli_num_rows($result1) !=0 ){
  $sql = "SELECT user_id, user_email, review, Approval_status FROM customer_reviews";
//executing the query
  $result = mysqli_query($conn, $sql);
  
//checking if the database is empty
if(mysqli_num_rows($result) != 0 ) {

while($row = mysqli_fetch_array($result)) {
    

 ?>    
       <div style="margin-left:10%; ,margin-right:10%; margin-top:50px; margin-bottom:50px;text-align:centre;background:#66d3ff;">
       <div class="row" style="padding:5px;">
         <div class="col s1 md3"> <?php echo $row[0]; ?> </div>
          <div class="col s2 md3"> <?php echo $row[1]; ?> </div> 
          <div class="col s4 md3"> <?php echo $row[2]; ?> </div>
          <div class="col s1 md3"> <?php echo $row[3]; ?> </div>         
        </div>
		</div>
		<?php
       }
      }
     }
    }
  ?>
  	  <form action="ApproveReviewForm.php" class="form_design" method="post">
         user_id: <input type="text" name="User_id"> <br/> <br/>
         <input type="submit" value="Approve"/>		 
		 
	  </form>


</body>


<section id="Footer">	
<footer class="centre blue panel">
       
    <div class="center black-text">CSE370 Project, Group: 1, Section: 2</div>
</footer>
</section>

</html>