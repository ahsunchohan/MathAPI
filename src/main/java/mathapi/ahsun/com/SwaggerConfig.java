package mathapi.ahsun.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.VendorExtension;

@Configuration
public class SwaggerConfig {
	@Bean
	public Docket mathApi() {

		Contact contact = new Contact(
				"Ahsun Chohan",
				"https://github.com/ahsunchohan/MathAPI",
				"ahsun@nusg.net");

		List<VendorExtension> vendorExtensions = new ArrayList<>();

		ApiInfo apiInfo = new ApiInfo(
				"Math API Web Service documentation",
				"This pages documents Math API endpoints", "1.0",
				"https://github.com/ahsunchohan/MathAPI", contact,
				"Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", vendorExtensions);

		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo)
				.select()
				.apis(RequestHandlerSelectors.basePackage("mathapi.ahsun.com.controllers"))
				.paths(PathSelectors.any())
				.build();
	}

}