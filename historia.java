public class historia {
    public static void main(String[] args) throws InterruptedException {
        String message = "...\nAh!\nHâ?\n...\nUm homem acorda em uma completa escuridão. O ruído dos insetos, o som das gotas caindo em pedregulhos, a ausência de vozes dizem claramente que ele está encarceirado.\nQuando o mesmo aponta sua cabeça para o sul, procurando por uma saída, vê que realmente está preso em uma jaula.\nMas o local não é completamente escuro, ele apenas estava voltado para a parede, como uma criança chorando no canto de seu quarto.\nHá uma luz âmbar que advêm das grades, muito provavelmente proveniente de uma lamparina.\nPrestando atenção em sons mais profundos consegue-se ouvir barulhos de movimentos humanos, como se houvesse alguém inquieto onde está a fonte de luz.\n- Ei! Tem alguém aí?!\n...\nO silêncio toma o lugar por alguns segundos até que uma voz masculina vem daquela direção.\n...\nÉ possível ouvir agora o som de uma cadeira se arrastando, como se alguém tivesse se levantado de uma. Passos vem logo em seguida.\nEles vão ficando cada vez mais próximos até que o homem consegue enxergar uma silhueta parada na frente das grades daquele calabouço.\n- Hmpf... Estou surpreso que ainda consiga falar... Olhe para si mesmo, que situação lamentável.\nQuando aquela figura profere essas palavras, o homem volta seus olhos para si e vê que está usando apenas trapos para cobrir seu corpo... Com aquelas vestes completamente úmidas, é apenas uma aposta, mas poderíamos facilmente acreditar que seja seu próprio sangue molhando aqueles velhos farrapos em seu torso. Não é possível ver de fato bdevido a luz estar bem fraca, mas o homem consegue sentir as feridas e escoriações por toda sua pele o fazendo agonizar.\n- Hahahaha! Parece que não tem mais forças ao menos para grunhir novamente, não é mesmo?!\nRealmente, o homem para por alguns segundos para pensar e nota que está verdadeiramente exausto... Não há forças para se mover ou até mesmo para gritar. O que aconteceu até aqui? Pensou o homem.\nAo menos lembra-se de seu nome?\nQual seu nome?";
        
        
        char[] chars = message.toCharArray();

        for(int i=0; i < chars.length; i++){
            System.out.print(chars[i]);
            Thread.sleep(1 );
        }
        
    }
    
}