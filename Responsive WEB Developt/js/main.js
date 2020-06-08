const title = document.querySelector('h1')
function writer(element){
    const textAr = element.innerHTML.split('');
    element.innerHTML = ''
    textAr.forEach((letra,i)=>{
        setTimeout(()=>{
            element.innerHTML += letra;
        },100*i)
    })
}
writer(title);