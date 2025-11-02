# F1 Pilotos

Esta es una aplicación que lista pilotos de Fórmula 1.

## Tecnologías Utilizadas

- **Kotlin**: Lenguaje principal utilizado para el desarrollo de la aplicación.
- **Android Studio**: IDE utilizado para construir y gestionar el proyecto.

## Características

- Listado de pilotos de Fórmula 1
- Información básica de cada piloto (a completar con detalles específicos del proyecto)

## Arquitectura del proyecto

f1pilotos/
├─ app/
│ ├─ src/
│ │ ├─ main/
│ │ │ ├─ AndroidManifest.xml
│ │ │ ├─ java/
│ │ │ │ └─ com/ # Código Kotlin para las pantallas, estados y modelos de pilotos
│ │ │ └─ res/
│ │ │ ├─ drawable/ # Recursos gráficos
│ │ │ ├─ mipmap-*/ # Iconos del launcher en distintas densidades
│ │ │ ├─ values/ # Temas, colores, strings, estilos
│ │ │ └─ xml/ # Configuraciones XML adicionales
│ │ ├─ androidTest/ # Tests instrumentados (si aplica)
│ │ └─ test/ # Tests unitarios (si aplica)
│ ├─ build.gradle.kts # Configuración del módulo app
│ └─ proguard-rules.pro # Reglas de minificación/optimización (build release)
├─ build.gradle.kts # Configuración raíz (plugins, repos)
├─ settings.gradle.kts # Inclusión de módulos
├─ gradle/ # Wrapper y versiones
│ └─ libs.versions.toml # Catálogo de versiones/dependencias
└─ README.md

text

## Cómo usar

- Clona el repositorio
- Abre el proyecto con Android Studio
- Ejecuta la aplicación en un emulador o dispositivo físico