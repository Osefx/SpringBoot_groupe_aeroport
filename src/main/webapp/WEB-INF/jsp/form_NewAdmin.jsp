<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
      <meta charset="UTF-8">
      <title>Nouveau Client</title>
    </head>

    <body>
      <br>
      <form action="enrNewAdmin" method="POST" modelAttribute="utilisateur">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <br>
        <h2>Nouveau Client</h2>
        <br>
        <div class="mb-3">
          <label for="nomUtilisateur" class="form-label">Nom</label>
          <input type="text" class="form-control" id="nomUtilisateur" name="nomUtilisateur">
        </div>
        <div class="mb-3">
          <label for="prenomUtilisateur" class="form-label">Prenom</label>
          <input type="text" class="form-control" id="prenomUtilisateur" name="prenomUtilisateur">
        </div>
        </div>
        <div class="mb-3">
          <label for="telephone" class="form-label">Telephone</label>
          <input type="text" class="form-control" id="telephone" name="telephone">
        </div>
        <div class="mb-3">
          <label for="email" class="form-label">email</label>
          <input type="email" class="form-control" id="email" name="email">
        </div>
        <div class="mb-3">
          <label for="username" class="form-label">Username</label>
          <input type="text" class="form-control" id="username" name="username">
        </div>
        <div class="mb-3">
          <label for="password" class="form-label">Mot de passe</label>
          <input type="password" class="form-control" id="password" name="password">
          </div>
        <br>
        <button type="submit" class="btn btn-primary">Valider</button>
        <button type="reset" class="btn btn-secondary">Annuler</button>
      </form>

    </body>

    </html>