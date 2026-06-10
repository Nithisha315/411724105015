console.log("hi")
 const a=20;
 const b=30;
 console.log(a+b)
 const  name="nithisha";
 console.log(name)
 const arr=[1,3.4,"hello",true]
 console.log(arr)
 for(let i=0;i<arr.length;i++){
    console.log(arr[i])
 }
 arr[1]=3.1
 console.log(arr[1])

 arr.push("nithi") 
 console.log(arr)

 arr.pop()
 console.log(arr)
 const ptag=document.getElementById("ptag")
 ptag.innerHTML="print statement"

 function example(){
    console.log("i am working on it")
 }
 const input=document.getElementById("input")
 const output=document.getElementById("inputfield")

 input.addEventListener("input",()=>{
   output.textContent=input.value

 })
 const first=document.createElement("p")
 first.textContent="some text"
 document.body.appendChild(first)
 first.remove()