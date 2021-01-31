/*----------------------------------------------------------------------------------------------------------------------
    CommandPrompt sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.samples.commandpromptapp;

import org.csystem.util.StringUtil;

import java.util.Scanner;

public class CommandPrompt {
    private static final String [] COMMAND_STR = {"length", "reverse", "upper", "lower", "change", "clear"};
    private String m_prompt;
    private final Scanner m_kb;

    private static void lengthProc(String [] cmdInfo)
    {
        if (cmdInfo.length != 2) {
            System.out.println("length bir tane argüman almalıdır");
            return;
        }

        System.out.println(cmdInfo[1].length());
    }

    private static void reverseProc(String [] cmdInfo)
    {
        if (cmdInfo.length != 2) {
            System.out.println("reverse bir tane argüman almalıdır");
            return;
        }

        System.out.println(StringUtil.reverse(cmdInfo[1]));
    }

    private static void upperProc(String [] cmdInfo)
    {
        if (cmdInfo.length != 2) {
            System.out.println("upper bir tane argüman almalıdır");
            return;
        }

        System.out.println(cmdInfo[1].toUpperCase());
    }

    private static void lowerProc(String [] cmdInfo)
    {
        if (cmdInfo.length != 2) {
            System.out.println("lower bir tane argüman almalıdır");
            return;
        }

        System.out.println(cmdInfo[1].toLowerCase());
    }

    private void changeProc(String [] cmdInfo)
    {
        if (cmdInfo.length != 2) {
            System.out.println("change bir tane argüman almalıdır");
            return;
        }

        m_prompt = cmdInfo[1];
    }

    private static void clearProc(String [] cmdInfo)
    {
        for (int i = 0; i < 70; ++i)
            System.out.println();
    }

    private static String getCommandByText(String text)
    {
        if (text.length() < 3)
            return "";

        for (int i = 0; i < COMMAND_STR.length; ++i)
            if (COMMAND_STR[i].startsWith(text))
                return COMMAND_STR[i];

        return "";
    }

    private void doWorkForCommand(String [] cmdInfo)
    {
        switch (cmdInfo[0]) {
            case "length":
                lengthProc(cmdInfo);
                break;
            case "reverse":
                reverseProc(cmdInfo);
                break;
            case "upper":
                upperProc(cmdInfo);
                break;
            case "lower":
                lowerProc(cmdInfo);
                break;
            case "change":
                changeProc(cmdInfo);
                break;
            case "clear":
                clearProc(cmdInfo);
                break;
        }
    }

    private void parseCommand(String [] cmdInfo)
    {
        String cmdText = getCommandByText(cmdInfo[0]);

        if (!cmdText.isEmpty()) {
            cmdInfo[0] = cmdText;
            doWorkForCommand(cmdInfo);
        }
        else
            System.out.println("Geçersiz komut");
    }

    public CommandPrompt(String p)
    {
        m_prompt = p;
        m_kb = new Scanner(System.in);
    }

    public void run()
    {
        System.out.println("C ve Sistem Programcıları Derneği");
        System.out.println("Homework-013 sorusuna ilişkin bir iskelet");

        for (;;) {
            System.out.print(m_prompt + ">");
            String cmd = m_kb.nextLine().trim();

            String [] cmdInfo = cmd.split("[ \t]+");

            if ("quit".equals(cmdInfo[0]))
                break;

            parseCommand(cmdInfo);
        }

        System.out.println("Tekrar yapıyor musunuz?");
        System.out.println("C ve Sistem Programcıları Derneği");
    }
}
