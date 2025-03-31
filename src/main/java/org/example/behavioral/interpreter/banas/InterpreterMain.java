package org.example.behavioral.interpreter.banas;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Used mostly to convert one representation of data into another
 * Useful when combined with Java Reflection, otherwise usually ignored.
 * */
public class InterpreterMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String questionAsked = JOptionPane.showInputDialog(frame, "What is your question?");
        ConversionContext question = new ConversionContext(questionAsked);
        String fromConversion = question.getFromConversion();
        String toConversion = question.getToConversion();

        double quantity = question.getQuantity();

        try {
            // Reflection
            String className = Gallons.class.getName();
            System.out.println(className);
            Class tempClass = Class.forName(fromConversion);

            Constructor con = tempClass.getConstructor();

            Object convertFrom = (Expression) con.newInstance();

            Class[] methodParams = new Class[]{Double.TYPE};

            Method conversionMethod = tempClass.getMethod(toConversion, methodParams);

            Object[] params = new Object[]{new Double(quantity)};

            String toQty = (String) conversionMethod.invoke(convertFrom, params);

            String answerToQues = question.getResponse() + toQty + " " + toConversion;

            JOptionPane.showMessageDialog(null, answerToQues);
            frame.dispose();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        finally {
            frame.dispose();
        }
    }
}
