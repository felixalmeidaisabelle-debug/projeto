document.getElementById('formContato').addEventListener('submit', function(event) {
    event.preventDefault(); // evita recarregar a página
    const nome = document.getElementById('nome').value;
    alert(`Obrigado pelo contato, ${nome}! Em breve entraremos em contato.`);
    this.reset(); // limpa o formulário
});
