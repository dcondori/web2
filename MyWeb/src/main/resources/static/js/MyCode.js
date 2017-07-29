/* JS Document */

//función trimText, trim con un espacio entre las palabras del texto.
function trimText(text) {
    text.value=text.value.replace(/(^\s*)|(\s*$)/gi,"").replace(/[ ]{2,}/gi," ").replace(/\n +/,"\n");    	
    return true;
}

//función confirmDelete, ventana de confirmación.
function confirmDelete() {
    var isAccept=confirm("¿Está seguro de eliminar?");
    
    if(isAccept)
        return true;
    
    return false;
}

//función confirmDelete, ventana de confirmación.
function confirmDeleteID(ID) {
    var isAccept=confirm("¿Está seguro de eliminar el ID "+ID+"?");
    
    if(isAccept)
        return true;
    
    return false;
}