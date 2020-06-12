function criarTabela()
{
	var contador = 0;
	div.innerHTML = '';
	

	for(contador; contador < numero.value; contador++)
	{
		div.innerHTML += `<table border="1" class="tabela">
			<tr>
				<td>idTotem</td>
				<td>nomeAviso</td>
				<td>mensagemAviso</td>
				<td>Data/Hora</td>
				<td><button>Enviar técnico</button></td>
			</tr>
		</table>`
	}
}