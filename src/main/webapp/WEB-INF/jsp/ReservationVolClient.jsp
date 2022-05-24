<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page vols</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
	
	 
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
      crossorigin="anonymous"></script>
</head>
<body  style="background-image: url(https://n3pix.fr/wp-content/uploads/2022/05/BackgroundVoyage.png); background-repeat: no-repeat; background-size: 100%;">
	<div class="container" style="padding-top: 20px;">
	
<div class="container" id="contenuPrincipal" style="padding-top: 20px;">
        <h1 class="text-light" style="text-align: center;" id="phraseAccroche">Liste des vols</h1>
      </div>
	<table class="table">
		<thead>
		<div style="text-align: center; padding-top: 20px;">
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Date de depart</th>
				<th scope="col">Date d'arrivee</th>
				<th scope="col">Heure de depart</th>
				<th scope="col">Heure d'arrivee</th>
				<th scope="col">Fonctionalites</th>
			</tr>
			</div>
		</thead>
		<tbody>
			<c:forEach var="vol" items="${ listeVol }">
				<tr>
					<th scope="row">${ vol.getId() }</th>
					<td>${ vol.getDateDepart() }</td>
					<td>${ vol.getDateArrive() }</td>
					<td>${ vol.getHeureDepart() }</td>
					<td>${ vol.getHeureArrivee() }</td>
					<td>
						<a href="volReservationClient"><button type="button"
							class="btn btn-danger">Reserver</button></a> 
                        
					</td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>