package com.postman.postman.services;

import com.postman.postman.models.ArrayDouble;
import com.postman.postman.models.DoUntilResult;
import com.postman.postman.models.DoUntilNumber;
import com.postman.postman.models.Log;
import com.postman.postman.models.LogData;
import com.postman.postman.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostmanService {
  private LogRepository logRepository;

  @Autowired
  public PostmanService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  private int sum(DoUntilNumber doUntil) {
    int sum = 0;
    for (int i = 0; i <= doUntil.getUntil(); i++) {
      sum = sum + i;
    }
    return sum;
  }

  private int factor(DoUntilNumber doUntil) {
    int factor = 1;
    for (int i = 1; i <= doUntil.getUntil(); i++) {
      factor = factor * i;
    }
    return factor;
  }

  public DoUntilResult calculateNumber(String action, DoUntilNumber doUntil) {
    if (action.equals("sum")) {
      return new DoUntilResult(sum(doUntil));
    } else {
      return new DoUntilResult(factor(doUntil));
    }
  }

  public DoUntilResult sumArray(int[] numbersToCalculateWith) {
    int sum = 0;
    for (int number : numbersToCalculateWith) {
      sum += number;
    }
    return new DoUntilResult(sum);
  }

  public DoUntilResult multiplyArray(int[] numbersToCalculateWith) {
    int multipiled = 1;
    for (int number : numbersToCalculateWith) {
      multipiled *= number;
    }
    return new DoUntilResult(multipiled);
  }

  public ArrayDouble doubleArray(int[] numbersToCalculateWith) {
    for (int i = 0; i < numbersToCalculateWith.length; i++) {
      numbersToCalculateWith[i] *= 2;
    }
    return new ArrayDouble(numbersToCalculateWith);
  }

  public void addLog(Log log) {
    logRepository.save(log);
  }

  public LogData fillLogEntries(LogData logData) {
    logData.setEntries(logRepository.findAll());
    logData.setEntry_count(logRepository.findAll().size());
    return logData;
  }
}

