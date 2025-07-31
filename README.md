# 👨‍💼 Sistema de Gestión de Nómina y Empleados

Este proyecto fue desarrollado como una práctica personal con el objetivo de profundizar en el uso de **Java con Spring Boot**, aplicando buenas prácticas de arquitectura en capas, servicios REST y cálculos complejos relacionados con la nómina, según la normativa laboral vigente en **Colombia**.

El sistema permite realizar la gestión de empleados y el cálculo automatizado de sus pagos, incluyendo:

- 💰 Cálculo de viáticos
- 🕐 Horas extra
- 💸 Comisiones
- 🎁 Prima legal
- 📄 Generación de desprendible de pago
- 🔍 Consultas y búsquedas dinámicas por empleado y por pago

---

## 🛠️ Tecnologías Utilizadas

- ☕ Java (Spring Boot)
- 🧱 JPA + Hibernate
- 📦 Maven
- 🌐 HTML5 + CSS3 + JavaScript (vanilla)
- 🧮 MySQL (base de datos)
- 🧪 Postman (para pruebas de servicios REST)
- 📊 JMeter (para generar los desprendibles de pago en PDF)
- 🧩 Lombok (requiere plugin en el IDE)
- 💻 IntelliJ IDEA

---

## 📁 Funcionalidades Principales

- Gestión CRUD de empleados.
- Registro y cálculo detallado de nóminas por empleado.
- Generación de desprendible de pago.
- Consultas filtradas por fecha, cédula, cargo, entre otros.
- Cálculos ajustados a la legislación colombiana vigente en temas laborales.
- Consumo y exposición de servicios REST.
- Uso de anotaciones JPA para consultas dinámicas.

---

## ⚙️ Instalación y Uso

Para correr este proyecto en local, sigue estos pasos:

```bash
# 1. Clona el repositorio
git clone https://github.com/Edwar007/Proyecto-Nomina.git

# 2. Entra al directorio del proyecto
cd Proyecto-Nomina
