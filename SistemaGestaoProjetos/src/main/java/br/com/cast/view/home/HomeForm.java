package br.com.cast.view.home;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

public class HomeForm extends Form
{

   private static final long serialVersionUID = -8262619226149466852L;
   private TextField<String> login;
   private PasswordTextField senha;
   private AjaxButton entrar;
   private FeedbackPanel feedback;

   public HomeForm(String id)
   {
      super(id);

      criaCampos();
      criaBotoes();
   }

   public void criaCampos()
   {

      login = new TextField<String>("login");
      senha = new PasswordTextField("senha");
      feedback = new FeedbackPanel("feedback");

      add(login, senha, feedback);

   }

   public void criaBotoes()
   {
      entrar = new AjaxButton("entrar")
      {
         private static final long serialVersionUID = 8899522195030623815L;

         @Override
         protected void onSubmit(AjaxRequestTarget target, Form<?> form)
         {
            super.onSubmit(target, form);
         }

         @Override
         protected void onError(AjaxRequestTarget target, Form<?> form)
         {
            super.onError(target, form);
         }

      };

      add(entrar);
   }
}
