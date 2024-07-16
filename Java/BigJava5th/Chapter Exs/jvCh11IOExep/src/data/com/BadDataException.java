/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.com;
import java.io.IOException;
/**
 *
 * @author Pana
 * This class reports bad input data
 */
class BadDataException extends IOException {
    public BadDataException(){}
    public BadDataException(String message){
        super(message);
    }
}
