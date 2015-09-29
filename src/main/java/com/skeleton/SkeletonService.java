package com.skeleton;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is a dummy service
 */
@RestController
@RequestMapping("register")
public class SkeletonService {
  private static final Logger LOG = Logger.getLogger(SkeletonService.class.getName());

  @RequestMapping(
      method = RequestMethod.POST,
      consumes = "application/json",
      produces = "application/json")
  public ResponseEntity<RegisterOutput> register(@RequestBody RegisterInput registerInput) {
    LOG.log(Level.INFO, "New request: " + registerInput.getX());

    RegisterOutput registerOutput = new RegisterOutput();
    registerOutput.setMessage("registered: " + registerInput.getX());

    //wrap in a ResponseEntity in order to set a HTTP Status
    return new ResponseEntity<>(registerOutput, HttpStatus.CREATED);
  }
}
