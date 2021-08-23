<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Reservas</h1>
<table border="2" width="70%" padding="2">
	<tr>
		
		<th>IdTemplate</th>
		<th>Professor</th>
		<th>Qtd alunos</th>
		<th>Data</th>
		<th>Reserva</th>
	</tr>
	<c:forEach var="aula" items="${list}">
		<tr>
			<td>${aula.id}</td>
			<td>${aula.professor}</td>
			<td>${aula.qtdAlunos}</td>
			<td>${aula.data}</td>
			<td><a href="reservaAula">Reserva Aula</a>
		</tr>
	</c:forEach>
</table>
<br />
<a href="perfil">Início</a>
<a href="logout">Sair</a> 