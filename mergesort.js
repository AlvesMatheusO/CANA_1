function mergesort(list) {
    // Se a lista não tiver nenhum elemento ou apenas um, está ordenada.
    if (list.length <= 1) {
        return list;
    } 

    // acha o meio da lista
    let middle = Math.floor(list.length / 2);

    // divide em direita e esquerda 
    let left = list.slice(0, middle);
    let right = list.slice(middle);

    //chamada recursiva
    let leftSort = mergesort(left);
    let rightSort = mergesort(right);

    return merge(leftSort, rightSort);
}

function merge(left, right) {
    const result =  [];

    // enquanto ambas as listas tiverem elementos, compare e adicione o menor
    while (left.length && right.length) {
        if (left[0] <= right[0]) {
            result.push(left.shift());
     
        } else {
            result.push(right.shift());

        }
    }

    // junta o array ordenado
    return result.concat(left).concat(right);
}
