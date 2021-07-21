package ru.isys.trainings.task3.unit1;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Reflect {

    public String getSetterSource(Class<String> fieldType, String fieldName) throws NoSuchMethodException {

        Class<User> userClass = User.class;
        String methodName = String.format("set%C%s", fieldName.charAt(0), fieldName.substring(1));
        Method getter = userClass.getMethod(methodName, fieldType);

        // не нашел штатного способа получить с помощью reflection тело метода, поэтому сделал вот "это"
        // для простоты не стал получать информацию об исключениях
        Parameter[] parameters = getter.getParameters();
        String pseudoMethodSource = getAccessModifier(getter) +
                " " +
                getter.getReturnType().getSimpleName() +
                " " +
                getter.getName() +
                "(" +
                parameters[0].getType().getSimpleName() +
                " " + fieldName + ") {" +
                "\r\n" +
                "   this." + fieldName + " = " + fieldName + ";" +
                "\r\n" +
                "}";

        return pseudoMethodSource;

    }

    public String getGetterSource(String fieldName) throws NoSuchMethodException {

        Class<User> userClass = User.class;
        String methodName = String.format("get%C%s", fieldName.charAt(0), fieldName.substring(1));
        Method getter = userClass.getMethod(methodName);

        String pseudoMethodSource = getAccessModifier(getter) +
                " " +
                getter.getReturnType().getSimpleName() +
                " " +
                getter.getName() +
                "() {" +
                "\r\n" +
                "   return " + fieldName + ";" +
                "\r\n" +
                "}";

        return pseudoMethodSource;

    }

    private String getAccessModifier(Method method) {

        if (Modifier.isPublic(method.getModifiers())) {
            return "public";
        } else if (Modifier.isProtected(method.getModifiers())) {
            return "protected";
        } else {
            return "private";
        }

    }

}
