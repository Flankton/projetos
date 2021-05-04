const btnDecrement$ = document.getElementById("btnDecrementar");
const btnAcrescent$ = document.getElementById("btnAcrescentar");
const cont$ = document.getElementById("contador");
const slider$ = document.getElementById("myRange");
const valtot$ = document.getElementById("ValorTotal");
const btnMes$ = document.getElementById("btnMensal");
const btnAno$ = document.getElementById("btnAnual");
const btnComprarUrl$ = document.getElementById("urlBtnComprar");


valMensal = ["R$10,00","R$20,00","R$30,00","R$40,00","R$50,00","R$60,00","R$70,00","R$80,00","R$90,00","R$100,00"];
valAnual = ["R$120,00","R$130,00","R$140,00","R$150,00","R$160,00","R$170,00","R$180,00","R$190,00","R$200,00","R$210,00"];
let plano = true;
let contador = 1;
let corRosa = "rgb(189, 65, 189)";
let branco = "rgb(255,255,255)";
cont$.innerHTML = contador;
valtot$.innerHTML = valMensal[0];
slider$.value = cont$.innerHTML;
btnComprarUrl$.href = valMensal[0];

slider$.oninput = function() {
    contador = slider$.value;
    cont$.innerHTML = slider$.value;
 
    
}

slider$.addEventListener("mousemove", CorSlider )

btnMes$.addEventListener("click", function(){
    plano = true;
    btnMes$.style.background = corRosa;
    btnMes$.style.color=branco;

    btnAno$.style.background = branco;
    btnAno$.style.color = corRosa;
   

    ValorTot()
})
btnAno$.addEventListener("click", function(){
    plano=false;
    btnAno$.style.background = corRosa;
    btnAno$.style.color = branco;

    btnMes$.style.background = branco;
    btnMes$.style.color = corRosa;
    
    ValorTot()
})

btnDecrement$.addEventListener('click',function(){
    if (contador>1) {
        cont$.innerHTML = --contador;
        slider$.value = cont$.innerHTML;
        CorSlider()
    }
    
    
})

btnAcrescent$.addEventListener('click',function(){
    if (contador<10) {
        cont$.innerHTML = ++contador;
        slider$.value = cont$.innerHTML;
        CorSlider()
    }
    
    
})

function CorSlider(){
    let valorSlider = slider$.value;
    let cor = 'linear-gradient(90deg, rgb(189, 65, 189)'+valorSlider*10+ '%, rgb(255, 255, 255)'+valorSlider*10+'%)';
    slider$.style.background = cor;
    ValorTot()
}
    
function ValorTot(){
    if(plano){
        
        valtot$.innerHTML = valMensal[contador-1];
        btnComprarUrl$.href = valMensal[contador-1];
    }
        
    else{
        valtot$.innerHTML = valAnual[contador-1];
        btnComprarUrl$.href = valAnual[contador-1];
    }

}



