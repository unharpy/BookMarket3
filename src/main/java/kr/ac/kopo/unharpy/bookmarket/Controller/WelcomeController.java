package kr.ac.kopo.unharpy.bookmarket.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String WelcomMethod() {
        String WelcomeHtml = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <title>Welcome BookMarket</title>\n" +
                "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n" +
                "</head>\n" +
                "<body>\n" +
                "  <svg xmlns=\"http://www.w3.org/2000/svg\" class=\"d-none\">\n" +
                "    <symbol id=\"check2\" viewBox=\"0 0 16 16\">\n" +
                "      <path d=\"M13.854 3.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3.5-3.5a.5.5 0 1 1 .708-.708L6.5 10.293l6.646-6.647a.5.5 0 0 1 .708 0z\"/>\n" +
                "    </symbol>\n" +
                "    <symbol id=\"circle-half\" viewBox=\"0 0 16 16\">\n" +
                "      <path d=\"M8 15A7 7 0 1 0 8 1v14zm0 1A8 8 0 1 1 8 0a8 8 0 0 1 0 16z\"/>\n" +
                "    </symbol>\n" +
                "    <symbol id=\"moon-stars-fill\" viewBox=\"0 0 16 16\">\n" +
                "      <path d=\"M6 .278a.768.768 0 0 1 .08.858 7.208 7.208 0 0 0-.878 3.46c0 4.021 3.278 7.277 7.318 7.277.527 0 1.04-.055 1.533-.16a.787.787 0 0 1 .81.316.733.733 0 0 1-.031.893A8.349 8.349 0 0 1 8.344 16C3.734 16 0 12.286 0 7.71 0 4.266 2.114 1.312 5.124.06A.752.752 0 0 1 6 .278z\"/>\n" +
                "      <path d=\"M10.794 3.148a.217.217 0 0 1 .412 0l.387 1.162c.173.518.579.924 1.097 1.097l1.162.387a.217.217 0 0 1 0 .412l-1.162.387a1.734 1.734 0 0 0-1.097 1.097l-.387 1.162a.217.217 0 0 1-.412 0l-.387-1.162A1.734 1.734 0 0 0 9.31 6.593l-1.162-.387a.217.217 0 0 1 0-.412l1.162-.387a1.734 1.734 0 0 0 1.097-1.097l.387-1.162zM13.863.099a.145.145 0 0 1 .274 0l.258.774c.115.346.386.617.732.732l.774.258a.145.145 0 0 1 0 .274l-.774.258a1.156 1.156 0 0 0-.732.732l-.258.774a.145.145 0 0 1-.274 0l-.258-.774a1.156 1.156 0 0 0-.732-.732l-.774-.258a.145.145 0 0 1 0-.274l.774-.258c.346-.115.617-.386.732-.732L13.863.1z\"/>\n" +
                "    </symbol>\n" +
                "    <symbol id=\"sun-fill\" viewBox=\"0 0 16 16\">\n" +
                "      <path d=\"M8 12a4 4 0 1 0 0-8 4 4 0 0 0 0 8zM8 0a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 0zm0 13a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 13zm8-5a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2a.5.5 0 0 1 .5.5zM3 8a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2A.5.5 0 0 1 3 8zm10.657-5.657a.5.5 0 0 1 0 .707l-1.414 1.415a.5.5 0 1 1-.707-.708l1.414-1.414a.5.5 0 0 1 .707 0zm-9.193 9.193a.5.5 0 0 1 0 .707L3.05 13.657a.5.5 0 0 1-.707-.707l1.414-1.414a.5.5 0 0 1 .707 0zm9.193 2.121a.5.5 0 0 1-.707 0l-1.414-1.414a.5.5 0 0 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .707zM4.464 4.465a.5.5 0 0 1-.707 0L2.343 3.05a.5.5 0 1 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .708z\"/>\n" +
                "    </symbol>\n" +
                "  </svg>\n" +
                "\n" +
                "  <div class=\"dropdown position-fixed bottom-0 end-0 mb-3 me-3 bd-mode-toggle\">\n" +
                "    <button class=\"btn btn-bd-primary py-2 dropdown-toggle d-flex align-items-center\"\n" +
                "            id=\"bd-theme\"\n" +
                "            type=\"button\"\n" +
                "            aria-expanded=\"false\"\n" +
                "            data-bs-toggle=\"dropdown\"\n" +
                "            aria-label=\"Toggle theme (auto)\">\n" +
                "      <svg class=\"bi my-1 theme-icon-active\" width=\"1em\" height=\"1em\"><use href=\"#circle-half\"></use></svg>\n" +
                "      <span class=\"visually-hidden\" id=\"bd-theme-text\">Toggle theme</span>\n" +
                "    </button>\n" +
                "    <ul class=\"dropdown-menu dropdown-menu-end shadow\" aria-labelledby=\"bd-theme-text\">\n" +
                "      <li>\n" +
                "        <button type=\"button\" class=\"dropdown-item d-flex align-items-center\" data-bs-theme-value=\"light\" aria-pressed=\"false\">\n" +
                "          <svg class=\"bi me-2 opacity-50\" width=\"1em\" height=\"1em\"><use href=\"#sun-fill\"></use></svg>\n" +
                "          Light\n" +
                "          <svg class=\"bi ms-auto d-none\" width=\"1em\" height=\"1em\"><use href=\"#check2\"></use></svg>\n" +
                "        </button>\n" +
                "      </li>\n" +
                "      <li>\n" +
                "        <button type=\"button\" class=\"dropdown-item d-flex align-items-center\" data-bs-theme-value=\"dark\" aria-pressed=\"false\">\n" +
                "          <svg class=\"bi me-2 opacity-50\" width=\"1em\" height=\"1em\"><use href=\"#moon-stars-fill\"></use></svg>\n" +
                "          Dark\n" +
                "          <svg class=\"bi ms-auto d-none\" width=\"1em\" height=\"1em\"><use href=\"#check2\"></use></svg>\n" +
                "        </button>\n" +
                "      </li>\n" +
                "      <li>\n" +
                "        <button type=\"button\" class=\"dropdown-item d-flex align-items-center active\" data-bs-theme-value=\"auto\" aria-pressed=\"true\">\n" +
                "          <svg class=\"bi me-2 opacity-50\" width=\"1em\" height=\"1em\"><use href=\"#circle-half\"></use></svg>\n" +
                "          Auto\n" +
                "          <svg class=\"bi ms-auto d-none\" width=\"1em\" height=\"1em\"><use href=\"#check2\"></use></svg>\n" +
                "        </button>\n" +
                "      </li>\n" +
                "    </ul>\n" +
                "  </div>\n" +
                "\n" +
                "  <main>\n" +
                "    <div class=\"container py-4\">\n" +
                "      <header class=\"pb-3 mb-4 border-bottom\">\n" +
                "        <a href=\"/\" class=\"d-flex align-items-center text-body-emphasis text-decoration-none\">\n" +
                "          <svg version=\"1.0\" id=\"Layer_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"\n" +
                "               width=\"32px\" height=\"32px\" viewBox=\"0 0 64 64\" enable-background=\"new 0 0 64 64\" xml:space=\"preserve\">\n" +
                "            <g>\n" +
                "                <path fill=\"#231F20\" d=\"M1.59,0.805C0.59,1.562,0,2.746,0,4v48c0,1.785,1.184,3.355,2.902,3.848L28,64V8L5.098,0.152\n" +
                "                    C3.895-0.188,2.594,0.051,1.59,0.805z\"/>\n" +
                "                <path fill=\"#231F20\" d=\"M62.41,0.805c-1.004-0.754-2.309-0.992-3.508-0.652L36,8v56l25.098-8.152C62.816,55.355,64,53.785,64,52V4\n" +
                "                    C64,2.746,63.41,1.562,62.41,0.805z\"/>\n" +
                "            </g>\n" +
                "          </svg>\n" +
                "<!--          <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"40\" height=\"32\" class=\"me-2\" viewBox=\"0 0 118 94\" role=\"img\"><title>Bootstrap</title><path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M24.509 0c-6.733 0-11.715 5.893-11.492 12.284.214 6.14-.064 14.092-2.066 20.577C8.943 39.365 5.547 43.485 0 44.014v5.972c5.547.529 8.943 4.649 10.951 11.153 2.002 6.485 2.28 14.437 2.066 20.577C12.794 88.106 17.776 94 24.51 94H93.5c6.733 0 11.714-5.893 11.491-12.284-.214-6.14.064-14.092 2.066-20.577 2.009-6.504 5.396-10.624 10.943-11.153v-5.972c-5.547-.529-8.934-4.649-10.943-11.153-2.002-6.484-2.28-14.437-2.066-20.577C105.214 5.894 100.233 0 93.5 0H24.508zM80 57.863C80 66.663 73.436 72 62.543 72H44a2 2 0 01-2-2V24a2 2 0 012-2h18.437c9.083 0 15.044 4.92 15.044 12.474 0 5.302-4.01 10.049-9.119 10.88v.277C75.317 46.394 80 51.21 80 57.863zM60.521 28.34H49.948v14.934h8.905c6.884 0 10.68-2.772 10.68-7.727 0-4.643-3.264-7.207-9.012-7.207zM49.948 49.2v16.458H60.91c7.167 0 10.964-2.876 10.964-8.281 0-5.406-3.903-8.178-11.425-8.178H49.948z\" fill=\"currentColor\"></path></svg>-->\n" +
                "          <span class=\"fs-4\">&nbsp;Book Market2</span>\n" +
                "        </a>\n" +
                "      </header>\n" +
                "\n" +
                "      <div class=\"p-5 mb-4 bg-body-tertiary rounded-3\">\n" +
                "        <div class=\"container-fluid py-5\">\n" +
                "          <h1 class=\"display-5 fw-bold\">도서 쇼핑몰에 오신 것을 환영합니다</h1>\n" +
                "          <p class=\"col-md-8 fs-4\">BookMarket</p>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "\n" +
                "      <div class=\"row align-items-md-stretch text-center\">\n" +
                "        <div class=\"col-md-12\">\n" +
                "          <div class=\"h-100 p-5\">\n" +
                "            <h2>Welcome to Web Market</h2>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "\n" +
                "      <footer class=\"pt-3 mt-4 text-body-secondary border-top\">\n" +
                "        <span class=\"text-body-secondary\">&copy; 2025 BookMarket</span>\n" +
                "      </footer>\n" +
                "    </div>\n" +
                "  </main>\n" +
                "\n" +
                "  <style>\n" +
                "\n" +
                "  </style>\n" +
                "<!--  <h1>Welcome To Book Market</h1>-->\n" +
                "<!--  <h3>Welcome To Book Shopping Mall</h3>-->\n" +
                "</body>\n" +
                "</html>";

        return WelcomeHtml;
    }
}
