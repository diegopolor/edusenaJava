/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.CursoCtrl;
import controlador.EstudianteCtrl;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Dashboard extends javax.swing.JFrame {

    Inicio inicio = new Inicio();
    ListarEstudiantes listarEsu = new ListarEstudiantes();
    ListarProfesores listarProf = new ListarProfesores();
    ListarCursos listarCursos = new ListarCursos();
    int mouseX;
    int mouseY;
    int JPMenuTOP_Len = 314;
    /**
     * Creates new form dashboard
     */
    public Dashboard() {
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPContenedor = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        btnExitTxt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JPFondoMenu = new javax.swing.JPanel();
        JPMenuTOP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        JPInicio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        iconInicio = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        iconEstudiantes = new javax.swing.JLabel();
        jPProfesores = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JPCursos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JPSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        tabContSesiones = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPContenedor.setBackground(new java.awt.Color(255, 255, 255));
        JPContenedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JPContenedorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JPContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(252, 140, 105));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bienvedido");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 46, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Usuario");
        jPanel6.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 46, 116, -1));

        txtFecha.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("Fecha");
        jPanel6.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 80, 280, -1));

        btnExit.setBackground(new java.awt.Color(252, 140, 105));

        btnExitTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExitTxt.setForeground(new java.awt.Color(255, 255, 255));
        btnExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExitTxt.setText("X");
        btnExitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 40, -1));

        jPanel3.setBackground(new java.awt.Color(252, 140, 105));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 40, 40));

        JPContenedor.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 920, 150));

        JPFondoMenu.setBackground(new java.awt.Color(250, 125, 85));

        JPMenuTOP.setBackground(new java.awt.Color(250, 125, 85));
        JPMenuTOP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JPMenuTOPMouseDragged(evt);
            }
        });
        JPMenuTOP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPMenuTOPMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edusenaBlanco.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(250, 125, 85));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPMenuTOPLayout = new javax.swing.GroupLayout(JPMenuTOP);
        JPMenuTOP.setLayout(JPMenuTOPLayout);
        JPMenuTOPLayout.setHorizontalGroup(
            JPMenuTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMenuTOPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(JPMenuTOPLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPMenuTOPLayout.setVerticalGroup(
            JPMenuTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMenuTOPLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPInicio.setBackground(new java.awt.Color(252, 140, 105));
        JPInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 125, 85)));
        JPInicio.setToolTipText("");
        JPInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPInicioMouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inicio");

        iconInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon-home.png"))); // NOI18N

        javax.swing.GroupLayout JPInicioLayout = new javax.swing.GroupLayout(JPInicio);
        JPInicio.setLayout(JPInicioLayout);
        JPInicioLayout.setHorizontalGroup(
            JPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPInicioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(iconInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPInicioLayout.setVerticalGroup(
            JPInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
            .addComponent(iconInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(JPInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 80));

        jPanel5.setBackground(new java.awt.Color(252, 140, 105));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 125, 85)));
        jPanel5.setToolTipText("");
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estudiantes");

        iconEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon-estudiante.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(iconEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
            .addComponent(iconEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 310, 80));

        jPProfesores.setBackground(new java.awt.Color(252, 140, 105));
        jPProfesores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 125, 85), 1, true));
        jPProfesores.setToolTipText("");
        jPProfesores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPProfesoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPProfesoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPProfesoresMouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Profesores");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon-Profesor.png"))); // NOI18N

        javax.swing.GroupLayout jPProfesoresLayout = new javax.swing.GroupLayout(jPProfesores);
        jPProfesores.setLayout(jPProfesoresLayout);
        jPProfesoresLayout.setHorizontalGroup(
            jPProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProfesoresLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPProfesoresLayout.setVerticalGroup(
            jPProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 310, 80));

        JPCursos.setBackground(new java.awt.Color(252, 140, 105));
        JPCursos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 125, 85)));
        JPCursos.setToolTipText("");
        JPCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPCursosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPCursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPCursosMouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cursos");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon-cursos.png"))); // NOI18N

        javax.swing.GroupLayout JPCursosLayout = new javax.swing.GroupLayout(JPCursos);
        JPCursos.setLayout(JPCursosLayout);
        JPCursosLayout.setHorizontalGroup(
            JPCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCursosLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPCursosLayout.setVerticalGroup(
            JPCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(JPCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 310, 80));

        JPSalir.setBackground(new java.awt.Color(252, 140, 105));
        JPSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPSalirMouseExited(evt);
            }
        });

        lblSalir.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("Cerrar sesión");

        javax.swing.GroupLayout JPSalirLayout = new javax.swing.GroupLayout(JPSalir);
        JPSalir.setLayout(JPSalirLayout);
        JPSalirLayout.setHorizontalGroup(
            JPSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(JPSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
        );
        JPSalirLayout.setVerticalGroup(
            JPSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(JPSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPFondoMenuLayout = new javax.swing.GroupLayout(JPFondoMenu);
        JPFondoMenu.setLayout(JPFondoMenuLayout);
        JPFondoMenuLayout.setHorizontalGroup(
            JPFondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPMenuTOP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPFondoMenuLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(JPSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPFondoMenuLayout.setVerticalGroup(
            JPFondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPFondoMenuLayout.createSequentialGroup()
                .addComponent(JPMenuTOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(JPSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        JPContenedor.add(JPFondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 680));

        tabContSesiones.setBackground(new java.awt.Color(242, 149, 107));
        tabContSesiones.setForeground(new java.awt.Color(255, 255, 255));
        tabContSesiones.setToolTipText("");
        tabContSesiones.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabContSesionesAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JPContenedor.add(tabContSesiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 920, 580));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JPContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JPContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPContenedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JPContenedorAncestorAdded
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = "Hoy es "+dateFormat.format(date);
        txtFecha.setText(fecha);

    }//GEN-LAST:event_JPContenedorAncestorAdded

    private void JPCursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPCursosMouseExited
        JPCursos.setBackground(new Color(252,140,105));
    }//GEN-LAST:event_JPCursosMouseExited

    private void JPCursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPCursosMouseEntered
        JPCursos.setBackground(new Color(250,125,85));
    }//GEN-LAST:event_JPCursosMouseEntered

    private void JPCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPCursosMouseClicked
        tabContSesiones.setSelectedComponent(listarCursos);
    }//GEN-LAST:event_JPCursosMouseClicked

    private void jPProfesoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPProfesoresMouseExited
        jPProfesores.setBackground(new Color(252,140,105));
    }//GEN-LAST:event_jPProfesoresMouseExited

    private void jPProfesoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPProfesoresMouseEntered
        jPProfesores.setBackground(new Color(250,125,85));
    }//GEN-LAST:event_jPProfesoresMouseEntered

    private void jPProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPProfesoresMouseClicked

        tabContSesiones.setSelectedComponent(listarProf);
    }//GEN-LAST:event_jPProfesoresMouseClicked

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new Color(252,140,105));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new Color(250,125,85));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked

        tabContSesiones.setSelectedComponent(listarEsu);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void JPInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPInicioMouseExited
        JPInicio.setBackground(new Color(252,140,105));
    }//GEN-LAST:event_JPInicioMouseExited

    private void JPInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPInicioMouseEntered
        JPInicio.setBackground(new Color(250,125,85));
    }//GEN-LAST:event_JPInicioMouseEntered

    private void JPInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPInicioMouseClicked
        tabContSesiones.setSelectedComponent(inicio);
    }//GEN-LAST:event_JPInicioMouseClicked

    private void JPSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_JPSalirMouseClicked

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - (mouseX+JPMenuTOP_Len), y - mouseY);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void JPMenuTOPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPMenuTOPMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_JPMenuTOPMousePressed

    private void JPMenuTOPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPMenuTOPMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_JPMenuTOPMouseDragged

    private void JPSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPSalirMouseEntered
          JPSalir.setBackground(new Color(248,154,124));
    }//GEN-LAST:event_JPSalirMouseEntered

    private void JPSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPSalirMouseExited
       JPSalir.setBackground(new Color(252,140,105));
    }//GEN-LAST:event_JPSalirMouseExited

    private void tabContSesionesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabContSesionesAncestorAdded

        tabContSesiones.addTab("", inicio);
        tabContSesiones.addTab("", listarEsu);
        tabContSesiones.addTab("", listarProf);
        tabContSesiones.addTab("", listarCursos);

        tabContSesiones.setSelectedComponent(inicio);
    }//GEN-LAST:event_tabContSesionesAncestorAdded

    private void btnExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitTxtMouseEntered
        btnExit.setBackground(Color.red);
        btnExit.setOpaque(true);

    }//GEN-LAST:event_btnExitTxtMouseEntered

    private void btnExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitTxtMouseExited
        btnExit.setBackground(Color.white);
        btnExit.setOpaque(false);    
    }//GEN-LAST:event_btnExitTxtMouseExited

    private void btnExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitTxtMouseClicked
         System.exit(0);
    }//GEN-LAST:event_btnExitTxtMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jPanel3.setBackground(new Color(253,157,126));
        jPanel3.setOpaque(true);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
       jPanel3.setBackground(new Color(250,125,85));
       jPanel3.setOpaque(false);
    }//GEN-LAST:event_jLabel5MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPContenedor;
    private javax.swing.JPanel JPCursos;
    private javax.swing.JPanel JPFondoMenu;
    private javax.swing.JPanel JPInicio;
    private javax.swing.JPanel JPMenuTOP;
    private javax.swing.JPanel JPSalir;
    private javax.swing.JPanel btnExit;
    private javax.swing.JLabel btnExitTxt;
    private javax.swing.JLabel iconEstudiantes;
    private javax.swing.JLabel iconInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPProfesores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblSalir;
    public javax.swing.JTabbedPane tabContSesiones;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
