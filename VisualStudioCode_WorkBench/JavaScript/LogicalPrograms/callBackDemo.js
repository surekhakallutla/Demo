add(5,5,result);

function add(a,b,callback) {
    console.log(a, "" , b);
    callback(a,b);
}
function result(a,b) {
    console.log(a+b);
}