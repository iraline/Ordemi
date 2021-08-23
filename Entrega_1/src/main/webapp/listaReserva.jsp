<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Arquivos Armazenados</h1>
<table border="2" width="70%" padding="2">
	<tr>
		<th>Id</th>
		<th>Numero Fiscal</th>
		<th>URL</th>
		<th>É relatório</th>
		<th>QRCODE</th>
		<th>Deletar</th>
	</tr>
	<c:forEach var="arquivo" items="${list}">
		<tr>
			<td>${arquivo.idArquivo}</td>
			<td>${arquivo.numeroFiscal}</td>
			<td>${arquivo.url}</td>
			<td>${arquivo.relatorio}</td>
			<td>${arquivo.qrcode}</td>
			<!--  <td><a href="editarquivo/${arquivo.idArquivo}">Editar</a></td> -->
			<td><a href="deletearquivo/${arquivo.idArquivo}">Deletar</a></td>
			<td><a href="visualizarArquivo">Visualizar arquivo</a>
		</tr>
	</c:forEach>
</table>
<br />
<a href="perfil">Início</a>
<a href="logout">Sair</a> 