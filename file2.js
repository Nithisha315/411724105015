console.log("A")
console.log("B")
console.log("C")

const promise = new Promise((resolve, reject) => {
    const success = true;
    if (success) {
        console.log("done")
    } else {
        console.log("no")
    }
})

promise.then(res => {
    console.log(res)
})
.catch(err => {
    console.log(err)
})