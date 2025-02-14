# Template Engine Comparison Project

## Description
This project serves as a sandbox to explore and compare different template engines for generating dynamic content. Specifically, it provides two key features:

1. **Live Preview**: Displaying a contract in the browser using a mocked data set, which allows users to preview the generated content before downloading.
2. **PDF Generation**: Generating and downloading a PDF version of the contract from the same template.

Currently, the project uses **Thymeleaf** as the template engine, but other template engines will be tested and evaluated to determine which one best suits the project's needs.

## Prerequisites
Ensure that you have Java 17 (or the Java version specified in the `build.gradle` file) set up on your machine. You can set the Java version in the `build.gradle` file like this:

```gradle
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)  // Preferably Java 17
    }
}
```
## Endpoints

### Preview Contract

- **URL:** `http://localhost:8080/contract`
- **Description:** Displays a preview of the contract populated with mocked data. This is useful for checking how the contract will look before generating it.
- **Usage:** Open the URL in your browser to view the contract preview.

### Download Contract as PDF

- **URL:** `http://localhost:8080/download-pdf`
- **Description:** Generates the contract as a PDF and triggers the download when accessed.
- **Usage:** Access this URL to download the contract as a PDF file.


## Comparison Table

| Criteria                | Thymeleaf                          | Handlebars                       |
|-------------------------|------------------------------------|----------------------------------|
| **HTML Compliance**      | ✔️ Requires proper HTML tag closure | |
| **Error Handling**       | ✔️ Built-in error handling         | |
| **Ease of Use**          | ✔️ Easy to learn and use           | |
| **Spring Boot Integration** | ✔️ Seamless integration          | |
| **Template Syntax**      | ✔️ HTML-based, natural templates   | |
| **Server-Side Rendering**| ✔️ Excellent support               | |
| **Client-Side Rendering**| ❌ Not designed for client-side    | |
| **Performance**          | ✔️ Fast server-side rendering      | |
| **Community Support**    | ✔️ Strong community and docs      | |
| **Learning Curve**       | ❌ Steeper for beginners           | |
