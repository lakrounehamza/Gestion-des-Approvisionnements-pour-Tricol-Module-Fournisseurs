# 🧾 Tricol – Application de gestion des fournisseurs

## 📘 Contexte du projet
**Tricol** est une entreprise spécialisée dans la conception et la fabrication de vêtements professionnels.  
Ce projet constitue la première phase du futur système complet de gestion des approvisionnements.  
L’objectif est de développer un **module de gestion des fournisseurs** avec **Spring Core** et **Spring Data JPA**, tout en posant les bases d’une architecture extensible.

---

## 🚀 Objectifs
Créer une application **Java / Spring** permettant :
- L’ajout, la modification et la suppression de fournisseurs.
- La consultation de la liste des fournisseurs.
- L’exposition d’une API REST complète pour la gestion des fournisseurs.

---

## ⚙️ Fonctionnalités principales

### 🔹 Gestion des fournisseurs
| Fonction | Description |
|-----------|--------------|
| **Ajouter un fournisseur** | Enregistrer un nouveau fournisseur avec les informations : société, adresse, contact, email, téléphone, ville, ICE. |
| **Modifier un fournisseur** | Mettre à jour les informations d’un fournisseur existant. |
| **Supprimer un fournisseur** | Retirer un fournisseur du système. |
| **Lister les fournisseurs** | Afficher la liste complète des fournisseurs avec tri (ex. par nom). |

---

## 🧩 Architecture du projet

### 🏗️ Conception en couches
Controller -> Service -> Repository -> Base de données

- **Controller** : gère les requêtes HTTP (API REST).
- **Service** : contient la logique métier.
- **Repository** : gère la persistance via Spring Data JPA.
- **Entity** : représente la structure des données.

### 📚 Technologies utilisées
- **Langage** : Java 17+
- **Framework** : Spring Core / Spring MVC / Spring Data JPA
- **Base de données** : H2 (en mémoire) ou MySQL
- **Build tool** : Maven
- **API REST** : JSON (via Spring Web)
- **Test** : JUnit, Mockito (optionnel)

---

## 🧠 Concepts Spring utilisés
- **Inversion of Control (IoC)** et **Dependency Injection (DI)**
- **Spring Beans** et leurs **scopes**
- **ApplicationContext** et **BeanFactory**
- **Configuration Spring** :
    - via XML
    - via annotations (`@Component`, `@Service`, `@Repository`, `@Controller`)
    - via Java Config (`@Configuration`, `@Bean`)
- **Component Scanning**

---

## 🌐 Endpoints REST

| Méthode | Endpoint | Description |
|----------|-----------|--------------|
| `GET` | `/api/v1/fournisseurs` | Récupérer la liste de tous les fournisseurs |
| `GET` | `/api/v1/fournisseurs/{id}` | Récupérer un fournisseur par ID |
| `POST` | `/api/v1/fournisseurs` | Ajouter un nouveau fournisseur |
| `PUT` | `/api/v1/fournisseurs/{id}` | Mettre à jour un fournisseur |
| `DELETE` | `/api/v1/fournisseurs/{id}` | Supprimer un fournisseur |

Exemple JSON :
```json
{
  "societe": "TextilPro",
  "adresse": "Rue des ateliers, Casablanca",
  "contact": "Mme Nadia",
  "email": "contact@textilpro.ma",
  "telephone": "0600000000",
  "ville": "Casablanca",
  "ice": "0011223344"
}
```
## 💾 Installation et exécution
#### 1️⃣ Cloner le projet

```
git  clone   https://github.com/lakrounehamza/Gestion-des-Approvisionnements-pour-Tricol-Module-Fournisseurs.git
cd Gestion-des-Approvisionnements-pour-Tricol-Module-Fournisseurs
```
### 2️⃣ Construire le projet
```
mvn clean install

```