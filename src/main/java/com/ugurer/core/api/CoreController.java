package com.ugurer.core.api;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ugurer.core.model.CoreEntity;
import com.ugurer.core.service.CoreService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin
public abstract class CoreController<T extends CoreEntity> {

    private CoreService<T> coreService;


    public CoreController(CoreService<T> coreService) {
        this.coreService=coreService;
    }

	@RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<T> listAll() {
		log.info("call getAll method");
        return this.coreService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
	public T create(@RequestBody T entity) {
		log.info("call update method");
		return coreService.saveOrUpdate(entity);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public T update(@PathVariable(value = "id") int id, @RequestBody T entity) {
		log.info("call save method");
		return coreService.saveOrUpdate(entity);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") int id) {
		log.info("call delete method");
		coreService.delete(id);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public T get(@PathVariable(value = "id") int id) {
		log.info("call getById method");
		return coreService.getById(id);
	}

	public CoreService<T> getService() {
		return this.coreService;
	}
	
}