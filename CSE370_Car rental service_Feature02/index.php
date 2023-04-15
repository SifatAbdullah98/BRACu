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
    </head>
    <body class="teal lighten-3">
	  <section id="Menu Bar">
        <nav class="white z-depth-0">
            <div class="container">
                <a href="index.php" class="brand-logo brand-text" style="font-family: Dancing-Script !important;">Car Rental Webiste</a>
                <ul id="nav-mobile" class="class right hide-on-small-and-down">
                    <li><a href="vehicle.php" class="btn brand z-depth-0">VEHICLES</a></li>
                    <li><a href="register.php" class="btn brand z-depth-0">REGISTER</a></li>                   
                    <li><a href="index.php" class="btn brand z-depth-0">Home</a></li>
                    <li><a href="CustomerReview.php" class="btn brand z-depth-0">Review</a></li>
                </ul>
            </div>
        </nav>
       </section>
	   
	   
	<section id="Login in">
	  <div class="centre pink title black-text">Due to the Covid Outbreak, we are understaffed. Please be patient & Log in </div>
	  
	  <form action="login.php" class="form_design" method="post">
	     Email : <input type="text" name="mail"> <br/> <br/>
         Customer id : <input type="text" name="id"> <br/> <br/>
         Password : <input type="password" name="pass"> <br/> <br/> <br/>
         <input type="submit" value="login"/>		 
		 
	  </form>
	
	</section>		
	</body>
	
<section id="Footer">	
<footer class="centre blue panel">
       
    <div class="center black-text">CSE370 Project, Group: 1, Section: 2</div>
</footer>
</section>
