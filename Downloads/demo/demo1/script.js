function giaiPT() {

    let a = parseFloat(document.getElementById("a").value);
    let b = parseFloat(document.getElementById("b").value);
    let c = parseFloat(document.getElementById("c").value);

    let delta = b*b - 4*a*c;

    if(delta < 0){
        document.getElementById("ketqua").innerHTML = "Phương trình vô nghiệm";
    }
    else if(delta == 0){
        let x = -b/(2*a);
        document.getElementById("ketqua").innerHTML = "Phương trình có nghiệm kép x = " + x;
    }
    else{
        let x1 = (-b + Math.sqrt(delta))/(2*a);
        let x2 = (-b - Math.sqrt(delta))/(2*a);

        document.getElementById("ketqua").innerHTML =
        "x1 = " + x1 + "<br>x2 = " + x2;
    }

}