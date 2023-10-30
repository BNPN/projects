let sub=document.getElementById("submit");
let val=document.getElementById("name");
let p=document.getElementById("para");
function create(){
        let v=val.value;
        let list=document.createElement("li");
        if(v===""){
            alert("enter valid name")
        }
        else{
        list.textContent=v;
        p.appendChild(list);
        val.value="";
        }
    }
function enter(event){
    if(event.key==="Enter"){
        create();
    }
}
sub.addEventListener("key",enter);
sub.addEventListener("click",create);