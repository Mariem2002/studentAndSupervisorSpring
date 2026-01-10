package tn.enis.membre_service.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import tn.enis.membre_service.beans.OutilBean;

@FeignClient(name = "OUTIL-SERVICE", dismiss404 = true)
public interface OutilProxyService {
	@GetMapping("/outils/{id}")
	public OutilBean findOutilById(@PathVariable(name = "id") Long id);
}
