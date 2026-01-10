package tn.enis.membre_service.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import tn.enis.membre_service.beans.PublicationBean;

@FeignClient(name = "MEMBRE-SERVICE-PUBLICATION", dismiss404 = true)
public interface PublicationProxyService {
	@GetMapping("/publications/{id}")
	public PublicationBean findPublicationById(@PathVariable(name = "id") Long id);
}