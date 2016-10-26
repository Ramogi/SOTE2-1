
			function berechnen(){
				
				
				//Zahlen aus Input-Feldern auslesen
				var zahl1 = parseInt(document.getElementById("zahl1").value);
				
				var zahl2 = parseInt(document.getElementById("zahl2").value);
				
				var operator = document.getElementById("Operator");
				
				var strUser =operator.options[operator.selectedIndex].value;
		        var rechnerausgabe = document.getElementById("ergebnis");
		        var endErgebnis = 0;
				
		      //Zahlen verrechnen
		        switch (strUser){
		        case "plus":
		            endErgebnis = zahl1 + zahl2;
		            break;
		        case "minus":
		            endErgebnis = zahl1 - zahl2;
		            break;
		         case "mal":
		            endErgebnis = zahl1 * zahl2;
		            break;
		          case "geteilt":
		            endErgebnis = zahl1 / zahl2;
		            break;
		          default:
		            alert("Falsche Eingabe!");
		            }
		        
		      //Ergebnis einfügen
		        rechnerausgabe.innerHTML = endErgebnis;
			}
