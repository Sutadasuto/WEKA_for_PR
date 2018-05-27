/*
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
<<<<<<< HEAD
=======
=======
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 2 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program; if not, write to the Free Software
 *    Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

/*
 * BrowserHelper.java
<<<<<<< HEAD
 * Copyright (C) 2006-2012,2015 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2006-2012,2015 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2006 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.gui;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Method;
import java.net.URI;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * A little helper class for browser related stuff.
 * <p/>
 * 
 * The <code>openURL</code> method is based on <a
 * href="http://www.centerkey.com/java/browser/" target="_blank">Bare Bones
 * Browser Launch</a>, which is placed in the public domain.
 * 
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 12296 $
<<<<<<< HEAD
=======
=======
import java.awt.Component;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;


/**
 * A little helper class for browser related stuff. <p/>
 *
 * The <code>openURL</code> method is based on
 * <a href="http://www.centerkey.com/java/browser/" target="_blank">Bare Bones Browser Launch</a>,
 * which is placed in the public domain.
 *
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class BrowserHelper {

  /** Linux/Unix binaries to look for */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public final static String[] LINUX_BROWSERS = { "firefox", "google-chrome",
    "opera", "konqueror", "epiphany", "mozilla", "netscape" };

  /**
   * opens the URL in a browser.
   * 
   * @param url the URL to open
<<<<<<< HEAD
=======
=======
  public final static String[] LINUX_BROWSERS =
    {"firefox", "google-chrome", "opera", "konqueror", "epiphany", "mozilla", "netscape"};

  /**
   * opens the URL in a browser.
   *
   * @param url		the URL to open
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void openURL(String url) {
    openURL(null, url);
  }

  /**
   * opens the URL in a browser.
<<<<<<< HEAD
   * 
   * @param parent the parent component
   * @param url the URL to open
=======
<<<<<<< HEAD
   * 
   * @param parent the parent component
   * @param url the URL to open
=======
   *
   * @param parent	the parent component
   * @param url		the URL to open
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void openURL(Component parent, String url) {
    openURL(parent, url, true);
  }

  /**
   * opens the URL in a browser.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param parent the parent component
   * @param url the URL to open
   * @param showDialog whether to display a dialog in case of an error or just
   *          print the error to the console
<<<<<<< HEAD
=======
=======
   *
   * @param parent	the parent component
   * @param url		the URL to open
   * @param showDialog	whether to display a dialog in case of an error or
   * 			just print the error to the console
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void openURL(Component parent, String url, boolean showDialog) {
    String osName = System.getProperty("os.name");
    try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
        Desktop.getDesktop().browse(new URI(url));
      }
      else {
        System.err.println("Desktop or browse action not supported, using fallback to determine browser.");

        // Mac OS
        if (osName.startsWith("Mac OS")) {
          Class<?> fileMgr = Class.forName("com.apple.eio.FileManager");
          Method openURL = fileMgr.getDeclaredMethod("openURL",
              new Class[] { String.class });
          openURL.invoke(null, new Object[] { url });
        }
        // Windows
        else if (osName.startsWith("Windows")) {
          Runtime.getRuntime()
            .exec("rundll32 url.dll,FileProtocolHandler " + url);
        }
        // assume Unix or Linux
        else {
          String browser = null;
          for (int count = 0; count < LINUX_BROWSERS.length && browser == null; count++) {
            // look for binaries and take first that's available
            if (Runtime.getRuntime()
                .exec(new String[] { "which", LINUX_BROWSERS[count] }).waitFor() == 0) {
              browser = LINUX_BROWSERS[count];
              break;
            }
          }
          if (browser == null) {
            throw new Exception("Could not find web browser");
          } else {
            Runtime.getRuntime().exec(new String[] { browser, url });
          }
        }
      }
    } catch (Exception e) {
      String errMsg = "Error attempting to launch web browser:\n"
        + e.getMessage();

      if (showDialog) {
        JOptionPane.showMessageDialog(parent, errMsg);
      } else {
        System.err.println(errMsg);
      }
    }
  }

  /**
   * Generates a label with a clickable link.
   * 
   * @param url the url of the link
   * @param text the text to display instead of URL. if null or of length 0 then
   *          the URL is used
   * @return the generated label
   */
  public static JLabel createLink(String url, String text) {
    final String urlF = url;
    final JLabel result = new JLabel();
    result.setText((text == null) || (text.length() == 0) ? url : text);
    result.setToolTipText("Click to open link in browser");
    result.setForeground(Color.BLUE);
    result.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
          BrowserHelper.openURL(urlF);
        } else {
          super.mouseClicked(e);
        }
      }

      @Override
      public void mouseEntered(MouseEvent e) {
        result.setForeground(Color.RED);
      }

      @Override
      public void mouseExited(MouseEvent e) {
        result.setForeground(Color.BLUE);
      }
    });

    return result;
<<<<<<< HEAD
=======
=======
      // Mac OS
      if (osName.startsWith("Mac OS")) {
	Class fileMgr = Class.forName("com.apple.eio.FileManager");
	Method openURL = fileMgr.getDeclaredMethod("openURL", new Class[] {String.class});
	openURL.invoke(null, new Object[] {url});
      }
      // Windows
      else if (osName.startsWith("Windows")) {
	Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
      }
      // assume Unix or Linux
      else {
	String browser = null;
	for (int count = 0; count < LINUX_BROWSERS.length && browser == null; count++) {
	  // look for binaries and take first that's available
	  if (Runtime.getRuntime().exec(new String[] {"which", LINUX_BROWSERS[count]}).waitFor() == 0) {
	    browser = LINUX_BROWSERS[count];
	    break;
	  }
	}
	if (browser == null)
	  throw new Exception(Messages.getInstance().getString("BrowserHelper_Exception_Text"));
	else
	  Runtime.getRuntime().exec(new String[] {browser, url});
      }
    }
    catch (Exception e) {
      String errMsg = Messages.getInstance().getString("BrowserHelper_Exception_ErrMsg_Text") + e.getMessage();

      if (showDialog)
	JOptionPane.showMessageDialog(
	    parent, errMsg);
      else
	System.err.println(errMsg);
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
