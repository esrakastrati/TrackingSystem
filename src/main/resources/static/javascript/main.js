/* ======================================================================
  Author Custom JavaScript
====================================================================== */
// Loop through Array of Objects
var objPeople = [
	{ // Object @ 0 index
		username: "esra",
		password: "esra1"
	},
	{ // Object @ 1 index
		username: "mostafa",
		password: "mostafa1"
	},
	{ // Object @ 2 index
		username: "Yassin",
		password: "Yassin1"
	}

]

function getInfo() {

	
			// stop the function if this is found to be true
			//j = 1;
			var username=document.getElementById("username").value;
			var password=document.getElementById("password").value;

			for(var i =0;i< objPeople.length; i++){
			if(username==objPeople[i].username&&password==objPeople[i].password){
				window.location.href = "/";

				alert("Logged In");

			}
			
			
			
			}
			
			


}