/**
 * 
 */
  function answer()
      {
           var ans = document.getElementsByName('bookingtype');

for (var i = 0, length = ans.length; i < length; i++) {
    if (ans[i].checked) {
        if((ans[i].value)=="twoway")
        	document.getElementById("returndate").disabled = false;
        else
        	document.getElementById("returndate").disabled = true;
    }
}
      }
      
      
  function generateTicketFare() 
      {
                var numVal1 = Number(document.getElementById("passengernumber").value);
                var numVal2 = Number(document.getElementById("ticketfare").value);
               
               
                if(document.getElementById('oneway').checked == true) {   
                    var totalValue = (numVal1 * numVal2);
 
           } else {  
               var totalValue = 2*(numVal1 * numVal2);
  
           }  
                document.getElementById("totalticketfare").value = totalValue.toFixed(2);

            }
  function generateBill(){
	  
       var discount = Number(document.getElementById("discountpercentage").value);
        var totalTicketFare = Number(document.getElementById("totalticketfare").value);
        var x= (discount/100);
        var billAmount = (x*totalTicketFare);
        document.getElementById("billamount").value = billAmount.toFixed(2);

       
	  
  }
  function myFunction1() 
    {        
              var numVal1 = Number(document.getElementById("numberofrooms").value);
              var numVal2 = Number(document.getElementById("accomodationfareperroom").value);
              var totalValue=(numVal1*numVal2);
              document.getElementById("totalaccomodationfare").value = totalValue.toFixed(2);
              
          }
          
          function finalBill()
          {
	 /* var discount = Number(document.getElementById("discountpercentage").value);
        var totalTicketFare = Number(document.getElementById("totalticketfare").value);
	var x= (discount/100);
        var billAmount = (x*totalTicketFare);
	 var numVal1 = Number(document.getElementById("numberofrooms").value);
              var numVal2 = Number(document.getElementById("accomodationfareperroom").value);
              var totalValue=(numVal1*numVal2);
              var finalBillAmound= (billAmount+totalValue);
       document.getElementById("finalbill").value = finalBillAmound.toFixed(2);*/
var numVal1 = Number(document.getElementById("numberofrooms").value);
  var billAmount = Number(document.getElementById("billamount").value);   
                var numVal2 = Number(document.getElementById("accomodationfareperroom").value);
var totalValue=(numVal1*numVal2);
 var finalBillAmound= (billAmount+totalValue);
           
	
}