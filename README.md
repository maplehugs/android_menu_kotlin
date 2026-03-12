# app_cm1 — Aplicación Android (Kotlin)

Una aplicación Android ligera que demuestra un flujo de menú con búsqueda, vista web integrada, formulario y pantalla de resultados. Este README está pensado para ser claro, profesional y fácil de seguir.

![Demostración](docs/demo.gif)

Resumen rápido
- Proyecto: app_cm1
- Lenguaje: Kotlin
- Plataforma: Android
- GIF de demostración: `docs/demo.gif` (coloca aquí un solo GIF que muestre el funcionamiento de la app)

Pantallas principales
- `activity_splash.xml` — pantalla de bienvenida / splash
- `activity_main.xml` — menú principal
- `activity_buscar.xml` — pantalla de búsqueda
- `activity_webview.xml` — WebView para mostrar URLs dentro de la app
- `activity_resultado.xml` — muestra los resultados
- `activity_formulario.xml` — formulario para ingreso de datos

Características
- Interfaz sencilla y consistente entre pantallas
- Manejo básico de URLs (normaliza entradas que no contienen esquema)
- Navegación clara (botones Back/Up donde corresponde)
- Estructura preparada para localización y mejoras de estilo

Requisitos
- Android Studio (recomendado: versión compatible con Gradle Wrapper incluido)
- JDK 11 o superior
- Sistema operativo: Windows (instrucciones abajo usan PowerShell)
- Gradle: usar el wrapper incluido (`gradlew.bat`)

Instalación y ejecución (Windows / PowerShell)
1. Clona el repositorio y abre el proyecto en Android Studio o usa el wrapper desde la línea de comandos:

```powershell
# Clonar (ejemplo)
git clone <REPO_URL> app_cm1
cd app_cm1
```

2. Compilar y generar el APK con el wrapper de Gradle:

```powershell
# Compilar
.\gradlew.bat assembleDebug

# Instalar en dispositivo/emulador conectado
.\gradlew.bat installDebug
```

3. Alternativamente abre el proyecto en Android Studio y ejecuta desde el IDE.

Ejecución en emulador/dispositivo
- Asegúrate de tener un emulador AVD configurado o un dispositivo Android con la depuración USB activada.
- Usa `installDebug` (arriba) o ejecuta la app desde Android Studio.

Pruebas
- Tests unitarios (JVM):

```powershell
.\gradlew.bat test
```

- Tests instrumentados (requieren dispositivo/emulador):

```powershell
.\gradlew.bat connectedAndroidTest
```

Buenas prácticas y notas de UX
- Cada pantalla debe exponer navegación Up/Back cuando corresponda. Revisa `Toolbar`/`ActionBar` y declara parentActivity en el manifest si es pertinente.
- Normaliza entradas de URL (por ejemplo, `example.com` -> `https://example.com`) antes de abrir la `WebView`.
- Mantén vistas accesibles y con texto legible; evita elementos UI demasiado pequeños o densos.

Estructura del proyecto (resumen)
- `app/src/main/java/...` — código fuente Kotlin
- `app/src/main/res/layout/` — layouts XML para las activities
- `build.gradle.kts`, `gradle.properties`, `gradlew.bat` — configuración de build

Cómo contribuir
- Haz un fork del repositorio y crea una rama con un nombre descriptivo: `feature/<descripción>` o `fix/<descripción>`.
- Añade pruebas minimales cuando agregues funcionalidad o corrijas bugs.
- Mantén commits pequeños y con mensajes claros.
- Abre un Pull Request describiendo los cambios y su motivación.

Licencia
- Este proyecto incluye una licencia MIT por defecto. Sustituye o modifica la sección si prefieres otra licencia.

Contacto y soporte
- Para preguntas rápidas o información adicional, deja un issue en el repositorio describiendo el comportamiento esperado y el problema actual.

Notas finales
- Si deseas que actualice el README con badges, instrucciones CI o plantillas de contribución, indícalo y lo integraré.
