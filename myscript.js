var imgs = ["1.png","2.png","3.png","4.png"];
var counter=0;





function previous(){
    
    counter--;
      if(counter<0)
    counter =imgs.length-1;
    document.getElementById("image").src=imgs[counter];
}

function next(){
    
    counter++;
     if(counter>imgs.length-1)
      counter =0;
    document.getElementById("image").src=imgs[counter];
}

